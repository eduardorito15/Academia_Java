package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import io.altar.jseproject.model.Entity_;

public abstract class EntityRepository<T extends Entity_> {
	@PersistenceContext(unitName = "database")
	protected EntityManager entityManager;

	protected abstract Class<T> getEntityClass();

	protected abstract String getAllEntitiesQuery();
	protected abstract String getCountEntitiesQuery();

	public int addEntity(T e) {
		if (e.getEntityId() < 0) {
			throw new IllegalArgumentException("O campo ID deve ser null ao criar uma nova entidade");
		}
		return entityManager.merge(e).getEntityId();
	}

	public void removeEntity(int entityId) {
		T entity = entityManager.find(getEntityClass(), entityId);
		entityManager.remove(entity);
	}

	public T getEntity(int entityId) {
		return entityManager.find(getEntityClass(), entityId);
	}

	public Collection<T> getAllEntities() {
		return entityManager.createNamedQuery(getAllEntitiesQuery(), getEntityClass()).getResultList();
	}

	public void editEntity(T e) {
		entityManager.merge(e);
	}

	public int getSize() {
		return entityManager.createNamedQuery(getCountEntitiesQuery(), Integer.class).getSingleResult();
	}
}
