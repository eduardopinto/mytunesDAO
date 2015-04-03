/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListModelodadosData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		modelodados.DAOFactory lDAOFactory = modelodados.DAOFactory.getDAOFactory();
		System.out.println("Listing Content...");
		modelodados.Content[] modelodadosContents = lDAOFactory.getContentDAO().listContentByQuery(null, null);
		int length = Math.min(modelodadosContents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelodadosContents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video...");
		modelodados.Video[] modelodadosVideos = lDAOFactory.getVideoDAO().listVideoByQuery(null, null);
		length = Math.min(modelodadosVideos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelodadosVideos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Music...");
		modelodados.Music[] modelodadosMusics = lDAOFactory.getMusicDAO().listMusicByQuery(null, null);
		length = Math.min(modelodadosMusics.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelodadosMusics[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing App...");
		modelodados.App[] modelodadosApps = lDAOFactory.getAppDAO().listAppByQuery(null, null);
		length = Math.min(modelodadosApps.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelodadosApps[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User...");
		modelodados.User[] modelodadosUsers = lDAOFactory.getUserDAO().listUserByQuery(null, null);
		length = Math.min(modelodadosUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelodadosUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListModelodadosData listModelodadosData = new ListModelodadosData();
			try {
				listModelodadosData.listTestData();
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
