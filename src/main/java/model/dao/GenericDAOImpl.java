package model.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    private final Class<T> entityClass;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    protected GenericDAOImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    private void beginTransaction() {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }

    private void commitTransaction() {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void save(T entity) {
        try {
            beginTransaction();
            entityManager.persist(entity);
            commitTransaction();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public T findById(ID id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public void update(T entity) {
        try {
            beginTransaction();
            entityManager.merge(entity);
            commitTransaction();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void delete(T entity) {
        try {
            beginTransaction();
            entityManager.remove(entityManager.contains(entity) ? entity
                    : entityManager.merge(entity));
            commitTransaction();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return entityManager.createQuery("from " + entityClass.getName()).getResultList();
    }

    public void close() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
