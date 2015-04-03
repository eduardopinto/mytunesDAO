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

public interface MusicDAO {
	public Music loadMusicByORMID(int ID) throws PersistentException;
	public Music getMusicByORMID(int ID) throws PersistentException;
	public Music loadMusicByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music getMusicByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music loadMusicByORMID(PersistentSession session, int ID) throws PersistentException;
	public Music getMusicByORMID(PersistentSession session, int ID) throws PersistentException;
	public Music loadMusicByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music getMusicByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music[] listMusicByQuery(String condition, String orderBy) throws PersistentException;
	public Music[] listMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMusic(String condition, String orderBy) throws PersistentException;
	public java.util.List queryMusic(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMusicByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music[] listMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Music[] listMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMusic(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryMusic(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music loadMusicByQuery(String condition, String orderBy) throws PersistentException;
	public Music loadMusicByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music loadMusicByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Music loadMusicByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Music createMusic();
	public boolean save(modelodados.Music music) throws PersistentException;
	public boolean delete(modelodados.Music music) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Music music) throws PersistentException;
	public boolean deleteAndDissociate(modelodados.Music music, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(modelodados.Music music) throws PersistentException;
	public boolean evict(modelodados.Music music) throws PersistentException;
}
