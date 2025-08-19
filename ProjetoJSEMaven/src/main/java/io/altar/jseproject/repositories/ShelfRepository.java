package io.altar.jseproject.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.interfaces.ShelfInterface;

@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> implements ShelfInterface {

	@Override
	protected Class<Shelf> getEntityClass() {
		return Shelf.class;
	}

	@Override
	protected String getAllEntitiesQuery() {
return Shelf.GET_ALL_SHELVES;
	}

	@Override
	protected String getCountEntitiesQuery() {
return Shelf.GET_COUNT_SHELVES;
	}

}