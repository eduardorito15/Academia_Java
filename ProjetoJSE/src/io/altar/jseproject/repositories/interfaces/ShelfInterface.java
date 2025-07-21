package io.altar.jseproject.repositories.interfaces;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import io.altar.jseproject.model.Shelf;

public interface ShelfInterface {
	public int addEntity(Shelf e);

	public void removeEntity(int entityId);

	public Shelf getEntity(int entityId);

	public Set<Map.Entry<Integer, Shelf>> getAllEntities();

	public Collection<Shelf> getAllEntitiesByCollection();

	public void editEntity(Shelf e);

	public int getSize();
}
