package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.interfaces.ShelfInterface;

public class ShelfRepository extends EntityRepository<Shelf> implements ShelfInterface {
	private static final ShelfRepository INSTANCE = new ShelfRepository();

	private ShelfRepository() {

	}

	public static ShelfRepository getInstance() {
		return INSTANCE;
	}
}
