package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Lot.
 * @see Dao.Lot
 * @author Hibernate Tools
 */
@Stateless
public class LotHome {

	private static final Log log = LogFactory.getLog(LotHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Lot transientInstance) {
		log.debug("persisting Lot instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Lot persistentInstance) {
		log.debug("removing Lot instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Lot merge(Lot detachedInstance) {
		log.debug("merging Lot instance");
		try {
			Lot result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Lot findById(int id) {
		log.debug("getting Lot instance with id: " + id);
		try {
			Lot instance = entityManager.find(Lot.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
