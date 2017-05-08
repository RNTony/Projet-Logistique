package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

	public void persist(Detailplat transientInstance) {
		log.debug("persisting Detailplat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Detailplat persistentInstance) {
		log.debug("removing Detailplat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Detailplat merge(Detailplat detachedInstance) {
		log.debug("merging Detailplat instance");
		try {
			Detailplat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Detailplat findById(Integer id) {
		log.debug("getting Detailplat instance with id: " + id);
		try {
			Detailplat instance = entityManager.find(Detailplat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
