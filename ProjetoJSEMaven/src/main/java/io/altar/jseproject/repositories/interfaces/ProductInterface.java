package io.altar.jseproject.repositories.interfaces;

import java.util.Collection;

import io.altar.jseproject.model.Product;

public interface ProductInterface {
	public int addEntity(Product e);

	public void removeEntity(int entityId);

	public Product getEntity(int entityId);

	public Collection<Product> getAllEntities();

	public void editEntity(Product e);

	public int getSize();
}
