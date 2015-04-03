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
package modelodados.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import modelodados.*;

public class VideoDAOImpl implements modelodados.dao.VideoDAO {
	public Video loadVideoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadVideoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video getVideoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getVideoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadVideoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video getVideoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getVideoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Video) session.load(modelodados.Video.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video getVideoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Video) session.get(modelodados.Video.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video) session.load(modelodados.Video.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video getVideoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video) session.get(modelodados.Video.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVideo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryVideo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVideo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryVideo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video[] listVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video[] listVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVideo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryVideo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVideo(session, condition, orderBy);
			return (Video[]) list.toArray(new Video[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVideo(session, condition, orderBy, lockMode);
			return (Video[]) list.toArray(new Video[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video loadVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Video[] videos = listVideoByQuery(session, condition, orderBy);
		if (videos != null && videos.length > 0)
			return videos[0];
		else
			return null;
	}
	
	public Video loadVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Video[] videos = listVideoByQuery(session, condition, orderBy, lockMode);
		if (videos != null && videos.length > 0)
			return videos[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Video createVideo() {
		return new modelodados.Video();
	}
	
	public boolean save(modelodados.Video video) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().saveObject(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(modelodados.Video video) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().deleteObject(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Video video)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])video.getUsers().toArray(new modelodados.User[video.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(video);
			}
			return delete(video);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Video video, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])video.getUsers().toArray(new modelodados.User[video.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(video);
			}
			try {
				session.delete(video);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(modelodados.Video video) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().refresh(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(modelodados.Video video) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().evict(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
