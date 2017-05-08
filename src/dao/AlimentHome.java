package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final
import models.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Aliment.
 * @see Dao.Aliment
 * @author Hibernate Tools
 */
@Stateless
public class AlimentHome {

	private static final Log log = LogFactory.getLog(AlimentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Aliment transientInstance) {
		log.debug("persisting Aliment instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Aliment persistentInstance) {
		log.debug("removing Aliment instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Aliment merge(Aliment detachedInstance) {
		log.debug("merging Aliment instance");
		try {
			Aliment result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Aliment findById(Integer id) {
		log.debug("getting Aliment instance with id: " + id);
		try {
			Aliment instance = entityManager.find(Aliment.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
