package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Livraison.
 * @see Dao.Livraison
 * @author Hibernate Tools
 */
@Stateless
public class LivraisonHome {

	private static final Log log = LogFactory.getLog(LivraisonHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Livraison transientInstance) {
		log.debug("persisting Livraison instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Livraison persistentInstance) {
		log.debug("removing Livraison instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Livraison merge(Livraison detachedInstance) {
		log.debug("merging Livraison instance");
		try {
			Livraison result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Livraison findById(Integer id) {
		log.debug("getting Livraison instance with id: " + id);
		try {
			Livraison instance = entityManager.find(Livraison.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
