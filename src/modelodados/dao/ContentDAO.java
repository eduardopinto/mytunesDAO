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
package modelodados.dao;

import org.orm.*;
import org.hibernate.LockMode;
import modelodados.*;

public interface ContentDAO {
	public Content loadContentByORMID(int ID) throws PersistentException;
	public Content getContentByORMID(int ID) throws PersistentException;
	public Content loadContentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content getContentByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content loadContentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Content getContentByORMID(PersistentSession session, int ID) throws PersistentException;
	public Content loadContentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content getContentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content[] listContentByQuery(String condition, String orderBy) throws PersistentException;
	public Content[] listContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContent(String condition, String orderBy) throws PersistentException;
	public java.util.List queryContent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContentByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content[] listContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Content[] listContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContent(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryContent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content loadContentByQuery(String condition, String orderBy) throws PersistentException;
	public Content loadContentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content loadContentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Content loadContentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Content createContent();
	public boolean save(modelodados.Content content) throws PersistentException;
	public boolean delete(modelodados.Content content) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Content content) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Content content, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(modelodados.Content content) throws PersistentException;
	public boolean evict(modelodados.Content content) throws PersistentException;
}
