/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteModelodadosData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelodados.ModelodadosPersistentManager.instance().getSession().beginTransaction();
		try {
			modelodados.DAOFactory lDAOFactory = modelodados.DAOFactory.getDAOFactory();
			modelodados.dao.ContentDAO lmodelodadosContentDAO = lDAOFactory.getContentDAO();
			modelodados.Content lmodelodadosContent = lmodelodadosContentDAO.loadContentByQuery(null, null);
			// Delete the persistent object
			lmodelodadosContentDAO.delete(lmodelodadosContent);
			modelodados.dao.VideoDAO lmodelodadosVideoDAO = lDAOFactory.getVideoDAO();
			modelodados.Video lmodelodadosVideo = lmodelodadosVideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			lmodelodadosVideoDAO.delete(lmodelodadosVideo);
			modelodados.dao.MusicDAO lmodelodadosMusicDAO = lDAOFactory.getMusicDAO();
			modelodados.Music lmodelodadosMusic = lmodelodadosMusicDAO.loadMusicByQuery(null, null);
			// Delete the persistent object
			lmodelodadosMusicDAO.delete(lmodelodadosMusic);
			modelodados.dao.AppDAO lmodelodadosAppDAO = lDAOFactory.getAppDAO();
			modelodados.App lmodelodadosApp = lmodelodadosAppDAO.loadAppByQuery(null, null);
			// Delete the persistent object
			lmodelodadosAppDAO.delete(lmodelodadosApp);
			modelodados.dao.UserDAO lmodelodadosUserDAO = lDAOFactory.getUserDAO();
			modelodados.User lmodelodadosUser = lmodelodadosUserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			lmodelodadosUserDAO.delete(lmodelodadosUser);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteModelodadosData deleteModelodadosData = new DeleteModelodadosData();
			try {
				deleteModelodadosData.deleteTestData();
			}
			finally {
				modelodados.ModelodadosPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
