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

public interface VideoDAO {
	public Video loadVideoByORMID(int ID) throws PersistentException;
	public Video getVideoByORMID(int ID) throws PersistentException;
	public Video loadVideoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video getVideoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video loadVideoByORMID(PersistentSession session, int ID) throws PersistentException;
	public Video getVideoByORMID(PersistentSession session, int ID) throws PersistentException;
	public Video loadVideoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video getVideoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video[] listVideoByQuery(String condition, String orderBy) throws PersistentException;
	public Video[] listVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryVideo(String condition, String orderBy) throws PersistentException;
	public java.util.List queryVideo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateVideoByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryVideo(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryVideo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video loadVideoByQuery(String condition, String orderBy) throws PersistentException;
	public Video loadVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video loadVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Video loadVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Video createVideo();
	public boolean save(modelodados.Video video) throws PersistentException;
	public boolean delete(modelodados.Video video) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Video video) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Video video, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(modelodados.Video video) throws PersistentException;
	public boolean evict(modelodados.Video video) throws PersistentException;
}
