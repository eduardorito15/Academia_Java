package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.interfaces.ProductInterface;

public class ProductRepository extends EntityRepository<Product> implements ProductInterface {
	private static final ProductRepository INSTANCE = new ProductRepository();

	private ProductRepository() {

	}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}
}
