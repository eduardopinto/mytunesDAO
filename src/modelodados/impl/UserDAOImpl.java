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

public class UserDAOImpl implements modelodados.dao.UserDAO {
	public User loadUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadUserByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User getUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getUserByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User getUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (User) session.load(modelodados.User.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User getUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (User) session.get(modelodados.User.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User) session.load(modelodados.User.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User getUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User) session.get(modelodados.User.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryUser(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User[] listUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User[] listUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.User as User");
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
	
	public List queryUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser(session, condition, orderBy);
			return (User[]) list.toArray(new User[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser(session, condition, orderBy, lockMode);
			return (User[]) list.toArray(new User[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User[] users = listUserByQuery(session, condition, orderBy);
		if (users != null && users.length > 0)
			return users[0];
		else
			return null;
	}
	
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User[] users = listUserByQuery(session, condition, orderBy, lockMode);
		if (users != null && users.length > 0)
			return users[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.User as User");
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
	
	public java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public User createUser() {
		return new modelodados.User();
	}
	
	public boolean save(modelodados.User user) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().saveObject(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(modelodados.User user) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().deleteObject(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.User user)throws PersistentException {
		try {
			modelodados.Content[] lContentss = (modelodados.Content[])user.getContents().toArray(new modelodados.Content[user.getContents().size()]);
			for(int i = 0; i < lContentss.length; i++) {
				lContentss[i].getUsers().remove(user);
			}
			return delete(user);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.User user, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelodados.Content[] lContentss = (modelodados.Content[])user.getContents().toArray(new modelodados.Content[user.getContents().size()]);
			for(int i = 0; i < lContentss.length; i++) {
				lContentss[i].getUsers().remove(user);
			}
			try {
				session.delete(user);
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
	
	public boolean refresh(modelodados.User user) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().refresh(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(modelodados.User user) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().evict(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
