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

public class MusicDAOImpl implements modelodados.dao.MusicDAO {
	public Music loadMusicByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadMusicByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music getMusicByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getMusicByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadMusicByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music getMusicByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getMusicByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Music) session.load(modelodados.Music.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music getMusicByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Music) session.get(modelodados.Music.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Music) session.load(modelodados.Music.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music getMusicByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Music) session.get(modelodados.Music.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMusic(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryMusic(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMusic(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryMusic(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music[] listMusicByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listMusicByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music[] listMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listMusicByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryMusic(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Music as Music");
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
	
	public List queryMusic(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Music as Music");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Music", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music[] listMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMusic(session, condition, orderBy);
			return (Music[]) list.toArray(new Music[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music[] listMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMusic(session, condition, orderBy, lockMode);
			return (Music[]) list.toArray(new Music[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadMusicByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadMusicByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music loadMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Music[] musics = listMusicByQuery(session, condition, orderBy);
		if (musics != null && musics.length > 0)
			return musics[0];
		else
			return null;
	}
	
	public Music loadMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Music[] musics = listMusicByQuery(session, condition, orderBy, lockMode);
		if (musics != null && musics.length > 0)
			return musics[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateMusicByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateMusicByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateMusicByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Music as Music");
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
	
	public java.util.Iterator iterateMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Music as Music");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Music", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Music createMusic() {
		return new modelodados.Music();
	}
	
	public boolean save(modelodados.Music music) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().saveObject(music);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(modelodados.Music music) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().deleteObject(music);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Music music)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])music.getUsers().toArray(new modelodados.User[music.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(music);
			}
			return delete(music);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Music music, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])music.getUsers().toArray(new modelodados.User[music.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(music);
			}
			try {
				session.delete(music);
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
	
	public boolean refresh(modelodados.Music music) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().refresh(music);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(modelodados.Music music) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().evict(music);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
