package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import io.altar.jseproject.model.Entity_;

public abstract class EntityRepository<T extends Entity_> {
	private Map<Integer, T> db = new HashMap<Integer, T>();
	private int currentId = 0;

	public int addEntity(T e) {
		e.setEntityId(currentId);
		db.put(currentId, e);
		return currentId++;
	}

	public void removeEntity(int entityId) {
		db.remove(entityId);
	}

	public T getEntity(int entityId) {
		return db.get(entityId);
	}

	public Set<Map.Entry<Integer, T>> getAllEntities() {
		return db.entrySet();
	}

	public Collection<T> getAllEntitiesByCollection() {
		return db.values();
	}

	public void editEntity(T e) {
		db.put(e.getEntityId(), e);
	}
}
