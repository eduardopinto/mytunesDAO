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

public interface AppDAO {
	public App loadAppByORMID(int ID) throws PersistentException;
	public App getAppByORMID(int ID) throws PersistentException;
	public App loadAppByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public App getAppByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public App loadAppByORMID(PersistentSession session, int ID) throws PersistentException;
	public App getAppByORMID(PersistentSession session, int ID) throws PersistentException;
	public App loadAppByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public App getAppByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public App[] listAppByQuery(String condition, String orderBy) throws PersistentException;
	public App[] listAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryApp(String condition, String orderBy) throws PersistentException;
	public java.util.List queryApp(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAppByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public App[] listAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public App[] listAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryApp(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryApp(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public App loadAppByQuery(String condition, String orderBy) throws PersistentException;
	public App loadAppByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public App loadAppByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public App loadAppByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public App createApp();
	public boolean save(modelodados.App app) throws PersistentException;
	public boolean delete(modelodados.App app) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.App app) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.App app, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(modelodados.App app) throws PersistentException;
	public boolean evict(modelodados.App app) throws PersistentException;
}
