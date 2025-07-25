package io.altar.jseproject.services;

import java.util.Collection;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfService extends EntityService {
	private ShelfRepository sr = ShelfRepository.getInstance();

	public int addEntity(Shelf entity) {
		return sr.addEntity(entity);
	}

	public void removeEntity(int entityId) {
		sr.removeEntity(entityId);
	}

	public Shelf getEntity(int entityId) {
		return sr.getEntity(entityId);
	}

	public Collection<Shelf> getAllEntitiesByCollection() {
		return sr.getAllEntitiesByCollection();
	}

	public void editEntity(Shelf entity) {
		sr.editEntity(entity);
	}

	public int getSize() {
		return sr.getSize();
	}
}
