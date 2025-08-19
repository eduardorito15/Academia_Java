package io.altar.jseproject.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

@ApplicationScoped
public class ShelfService extends EntityService {
	@Inject
	private ShelfRepository sr;

	public int addEntity(Shelf entity) {
		return sr.addEntity(entity);
	}

	public void removeEntity(int entityId) {
		sr.removeEntity(entityId);
	}

	public Shelf getEntity(int entityId) {
		return sr.getEntity(entityId);
	}

	public void editEntity(Shelf entity) {
		sr.editEntity(entity);
	}

	public int getSize() {
		return sr.getSize();
	}
}
