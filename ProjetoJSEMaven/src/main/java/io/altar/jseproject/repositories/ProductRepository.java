package io.altar.jseproject.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.interfaces.ProductInterface;

@ApplicationScoped
public class ProductRepository extends EntityRepository<Product> implements ProductInterface {

	@Override
	protected Class<Product> getEntityClass() {
		return Product.class;
	}

	@Override
	protected String getAllEntitiesQuery() {
		return Product.GET_ALL_PRODUCTS;
	}

	@Override
	protected String getCountEntitiesQuery() {
		return Product.GET_COUNT_PRODUCTS;
	}
}
