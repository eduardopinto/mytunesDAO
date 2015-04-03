/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package modelodados;

import modelodados.impl.*;
import modelodados.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private ContentDAO _contentDAO = new ContentDAOImpl();
	public ContentDAO getContentDAO() {
		return _contentDAO;
	}
	
	private VideoDAO _videoDAO = new VideoDAOImpl();
	public VideoDAO getVideoDAO() {
		return _videoDAO;
	}
	
	private MusicDAO _musicDAO = new MusicDAOImpl();
	public MusicDAO getMusicDAO() {
		return _musicDAO;
	}
	
	private AppDAO _appDAO = new AppDAOImpl();
	public AppDAO getAppDAO() {
		return _appDAO;
	}
	
	private UserDAO _userDAO = new UserDAOImpl();
	public UserDAO getUserDAO() {
		return _userDAO;
	}
	
}

