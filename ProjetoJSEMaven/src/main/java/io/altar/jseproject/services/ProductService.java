package io.altar.jseproject.services;

import java.util.Collection;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductService extends EntityService {
	private ProductRepository pr = ProductRepository.getInstance();

	public int addEntity(Product entity) {
		return pr.addEntity(entity);
	}

	public void removeEntity(int entityId) {
		pr.removeEntity(entityId);
	}

	public Product getEntity(int entityId) {
		return pr.getEntity(entityId);
	}

	public Collection<Product> getAllEntitiesByCollection() {
		return pr.getAllEntitiesByCollection();
	}

	public void editEntity(Product entity) {
		pr.editEntity(entity);
	}

	public int getSize() {
		return pr.getSize();
	}
}