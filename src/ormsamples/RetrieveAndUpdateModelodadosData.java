/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateModelodadosData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = modelodados.ModelodadosPersistentManager.instance().getSession().beginTransaction();
		try {
			modelodados.DAOFactory lDAOFactory = modelodados.DAOFactory.getDAOFactory();
			modelodados.dao.ContentDAO lmodelodadosContentDAO = lDAOFactory.getContentDAO();
			modelodados.Content lmodelodadosContent = lmodelodadosContentDAO.loadContentByQuery(null, null);
			// Update the properties of the persistent object
			lmodelodadosContentDAO.save(lmodelodadosContent);
			modelodados.dao.VideoDAO lmodelodadosVideoDAO = lDAOFactory.getVideoDAO();
			modelodados.Video lmodelodadosVideo = lmodelodadosVideoDAO.loadVideoByQuery(null, null);
			// Update the properties of the persistent object
			lmodelodadosVideoDAO.save(lmodelodadosVideo);
			modelodados.dao.MusicDAO lmodelodadosMusicDAO = lDAOFactory.getMusicDAO();
			modelodados.Music lmodelodadosMusic = lmodelodadosMusicDAO.loadMusicByQuery(null, null);
			// Update the properties of the persistent object
			lmodelodadosMusicDAO.save(lmodelodadosMusic);
			modelodados.dao.AppDAO lmodelodadosAppDAO = lDAOFactory.getAppDAO();
			modelodados.App lmodelodadosApp = lmodelodadosAppDAO.loadAppByQuery(null, null);
			// Update the properties of the persistent object
			lmodelodadosAppDAO.save(lmodelodadosApp);
			modelodados.dao.UserDAO lmodelodadosUserDAO = lDAOFactory.getUserDAO();
			modelodados.User lmodelodadosUser = lmodelodadosUserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			lmodelodadosUserDAO.save(lmodelodadosUser);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateModelodadosData retrieveAndUpdateModelodadosData = new RetrieveAndUpdateModelodadosData();
			try {
				retrieveAndUpdateModelodadosData.retrieveAndUpdateTestData();
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
