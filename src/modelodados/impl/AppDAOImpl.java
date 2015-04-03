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

public class AppDAOImpl implements modelodados.dao.AppDAO {
	public App loadAppByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadAppByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App getAppByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getAppByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadAppByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App getAppByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getAppByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (App) session.load(modelodados.App.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App getAppByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (App) session.get(modelodados.App.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (App) session.load(modelodados.App.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App getAppByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (App) session.get(modelodados.App.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryApp(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryApp(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryApp(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryApp(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App[] listAppByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listAppByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App[] listAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listAppByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryApp(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.App as App");
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
	
	public List queryApp(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.App as App");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("App", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App[] listAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryApp(session, condition, orderBy);
			return (App[]) list.toArray(new App[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App[] listAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryApp(session, condition, orderBy, lockMode);
			return (App[]) list.toArray(new App[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadAppByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadAppByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App loadAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		App[] apps = listAppByQuery(session, condition, orderBy);
		if (apps != null && apps.length > 0)
			return apps[0];
		else
			return null;
	}
	
	public App loadAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		App[] apps = listAppByQuery(session, condition, orderBy, lockMode);
		if (apps != null && apps.length > 0)
			return apps[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateAppByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateAppByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateAppByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.App as App");
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
	
	public java.util.Iterator iterateAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.App as App");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("App", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public App createApp() {
		return new modelodados.App();
	}
	
	public boolean save(modelodados.App app) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().saveObject(app);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(modelodados.App app) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().deleteObject(app);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.App app)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])app.getUsers().toArray(new modelodados.User[app.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(app);
			}
			return delete(app);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.App app, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])app.getUsers().toArray(new modelodados.User[app.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(app);
			}
			try {
				session.delete(app);
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
	
	public boolean refresh(modelodados.App app) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().refresh(app);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(modelodados.App app) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().evict(app);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
