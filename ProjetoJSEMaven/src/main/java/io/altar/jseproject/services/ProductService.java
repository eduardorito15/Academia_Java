package io.altar.jseproject.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

@ApplicationScoped
public class ProductService extends EntityService {
	@Inject
	private ProductRepository pr;

	public int addEntity(Product entity) {
		return pr.addEntity(entity);
	}

	public void removeEntity(int entityId) {
		pr.removeEntity(entityId);
	}

	public Product getEntity(int entityId) {
		return pr.getEntity(entityId);
	}

	public void editEntity(Product entity) {
		pr.editEntity(entity);
	}

	public int getSize() {
		return pr.getSize();
	}
}