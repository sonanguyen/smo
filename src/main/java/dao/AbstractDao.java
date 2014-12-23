package dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public abstract class AbstractDao<T> {

    protected Provider<EntityManager> emp;

    protected Class<T> entityClass;

    public AbstractDao(Class<T> clazz) {
        this.entityClass = clazz;
    }

    @Inject
    public void setEntityManager(Provider<EntityManager> emp) {
        this.emp = emp;
    }

    @Transactional
    public T save(T entity) {
        emp.get().persist(entity);
        return entity;
    }

    public T get(Serializable id) {
        if (id == null)
            throw new PersistenceException("Id may not be null");
        return (T) emp.get().find(entityClass, id);
    }

    public JPAQuery find(String query, Object... params) {
        Query q = emp.get().createQuery(query, entityClass);
        for (int i = 1; i <= params.length; i++)
            // 1-based !
            q.setParameter(i, params[i - 1]);
        return new JPAQuery(query, q);
    }

    @Transactional
    public void update(T entity) {
        emp.get().merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        emp.get().remove(entity);
    }
}
