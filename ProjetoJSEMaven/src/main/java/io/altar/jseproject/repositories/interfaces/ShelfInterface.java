package io.altar.jseproject.repositories.interfaces;

import java.util.Collection;

import io.altar.jseproject.model.Shelf;

public interface ShelfInterface {
	public int addEntity(Shelf e);

	public void removeEntity(int entityId);

	public Shelf getEntity(int entityId);

	public Collection<Shelf> getAllEntities();

	public void editEntity(Shelf e);

	public int getSize();
}
