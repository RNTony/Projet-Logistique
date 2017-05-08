package dao;
// Generated 8 mai 2017 22:46:10 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Fournisseur.
 * @see Dao.Fournisseur
 * @author Hibernate Tools
 */
@Stateless
public class FournisseurHome {

	private static final Log log = LogFactory.getLog(FournisseurHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Fournisseur transientInstance) {
		log.debug("persisting Fournisseur instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Fournisseur persistentInstance) {
		log.debug("removing Fournisseur instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fournisseur merge(Fournisseur detachedInstance) {
		log.debug("merging Fournisseur instance");
		try {
			Fournisseur result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fournisseur findById(int id) {
		log.debug("getting Fournisseur instance with id: " + id);
		try {
			Fournisseur instance = entityManager.find(Fournisseur.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
