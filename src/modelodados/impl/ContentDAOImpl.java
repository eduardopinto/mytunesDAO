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

public class ContentDAOImpl implements modelodados.dao.ContentDAO {
	public Content loadContentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadContentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content getContentByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getContentByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadContentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content getContentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return getContentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Content) session.load(modelodados.Content.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content getContentByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Content) session.get(modelodados.Content.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Content) session.load(modelodados.Content.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content getContentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Content) session.get(modelodados.Content.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryContent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryContent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryContent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return queryContent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content[] listContentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listContentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content[] listContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return listContentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryContent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Content as Content");
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
	
	public List queryContent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Content as Content");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Content", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content[] listContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContent(session, condition, orderBy);
			return (Content[]) list.toArray(new Content[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content[] listContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContent(session, condition, orderBy, lockMode);
			return (Content[]) list.toArray(new Content[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadContentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return loadContentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content loadContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Content[] contents = listContentByQuery(session, condition, orderBy);
		if (contents != null && contents.length > 0)
			return contents[0];
		else
			return null;
	}
	
	public Content loadContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Content[] contents = listContentByQuery(session, condition, orderBy, lockMode);
		if (contents != null && contents.length > 0)
			return contents[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateContentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateContentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelodados.ModelodadosPersistentManager.instance().getSession();
			return iterateContentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Content as Content");
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
	
	public java.util.Iterator iterateContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelodados.Content as Content");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Content", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Content createContent() {
		return new modelodados.Content();
	}
	
	public boolean save(modelodados.Content content) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().saveObject(content);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(modelodados.Content content) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().deleteObject(content);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Content content)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])content.getUsers().toArray(new modelodados.User[content.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(content);
			}
			return delete(content);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(modelodados.Content content, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelodados.User[] lUserss = (modelodados.User[])content.getUsers().toArray(new modelodados.User[content.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getContents().remove(content);
			}
			try {
				session.delete(content);
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
	
	public boolean refresh(modelodados.Content content) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().refresh(content);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(modelodados.Content content) throws PersistentException {
		try {
			modelodados.ModelodadosPersistentManager.instance().getSession().evict(content);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
