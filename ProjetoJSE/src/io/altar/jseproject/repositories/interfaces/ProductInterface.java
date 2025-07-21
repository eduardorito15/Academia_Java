package io.altar.jseproject.repositories.interfaces;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import io.altar.jseproject.model.Product;

public interface ProductInterface {
	public int addEntity(Product e);

	public void removeEntity(int entityId);

	public Product getEntity(int entityId);

	public Set<Map.Entry<Integer, Product>> getAllEntities();

	public Collection<Product> getAllEntitiesByCollection();

	public void editEntity(Product e);

	public int getSize();
}
