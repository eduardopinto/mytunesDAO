/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateModelodadosData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelodados.ModelodadosPersistentManager.instance().getSession().beginTransaction();
		try {
			modelodados.DAOFactory lDAOFactory = modelodados.DAOFactory.getDAOFactory();
			modelodados.dao.ContentDAO lmodelodadosContentDAO = lDAOFactory.getContentDAO();
			modelodados.Content lmodelodadosContent = lmodelodadosContentDAO.createContent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : users, price
			lmodelodadosContentDAO.save(lmodelodadosContent);
			modelodados.dao.VideoDAO lmodelodadosVideoDAO = lDAOFactory.getVideoDAO();
			modelodados.Video lmodelodadosVideo = lmodelodadosVideoDAO.createVideo();
			// Initialize the properties of the persistent object here
			lmodelodadosVideoDAO.save(lmodelodadosVideo);
			modelodados.dao.MusicDAO lmodelodadosMusicDAO = lDAOFactory.getMusicDAO();
			modelodados.Music lmodelodadosMusic = lmodelodadosMusicDAO.createMusic();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : duration
			lmodelodadosMusicDAO.save(lmodelodadosMusic);
			modelodados.dao.AppDAO lmodelodadosAppDAO = lDAOFactory.getAppDAO();
			modelodados.App lmodelodadosApp = lmodelodadosAppDAO.createApp();
			// Initialize the properties of the persistent object here
			lmodelodadosAppDAO.save(lmodelodadosApp);
			modelodados.dao.UserDAO lmodelodadosUserDAO = lDAOFactory.getUserDAO();
			modelodados.User lmodelodadosUser = lmodelodadosUserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contents
			lmodelodadosUserDAO.save(lmodelodadosUser);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateModelodadosData createModelodadosData = new CreateModelodadosData();
			try {
				createModelodadosData.createTestData();
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
