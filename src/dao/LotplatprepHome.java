package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import models.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Lotplatprep.
 * @see Dao.Lotplatprep
 * @author Hibernate Tools
 */
@Stateless
public class LotplatprepHome {

	private static final Log log = LogFactory.getLog(LotplatprepHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(LotPlatPrep transientInstance) {
		log.debug("persisting Lotplatprep instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(LotPlatPrep persistentInstance) {
		log.debug("removing Lotplatprep instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public LotPlatPrep merge(LotPlatPrep detachedInstance) {
		log.debug("merging Lotplatprep instance");
		try {
			LotPlatPrep result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LotPlatPrep findById(Integer id) {
		log.debug("getting Lotplatprep instance with id: " + id);
		try {
			LotPlatPrep instance = entityManager.find(LotPlatPrep.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
