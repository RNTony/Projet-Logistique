package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import models.*;


/**
 * Home object for domain model class Detailplat.
 * @see Dao.Detailplat
 * @author Hibernate Tools
 */
@Stateless
public class DetailplatHome {

	private static final Log log = LogFactory.getLog(DetailplatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DetailPlat transientInstance) {
		log.debug("persisting Detailplat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DetailPlat persistentInstance) {
		log.debug("removing Detailplat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DetailPlat merge(DetailPlat detachedInstance) {
		log.debug("merging Detailplat instance");
		try {
			DetailPlat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DetailPlat findById(Integer id) {
		log.debug("getting Detailplat instance with id: " + id);
		try {
			DetailPlat instance = entityManager.find(DetailPlat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
