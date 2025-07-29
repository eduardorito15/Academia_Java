package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class AddProductToShelfState extends State {
	private ShelfRepository sr = ShelfRepository.getInstance();
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		System.out.println("Digite o id da prateleira:");
		int shelfId = sc.nextInt();
		sc.nextLine();
		Shelf s = sr.getEntity(shelfId);
		if (s == null) {
			System.out.println("Essa prateleira n�o existe.");
			return 1;
		}
		System.out.println("Introduza o id do produto a adicionar:");
		int productId = sc.nextInt();
		sc.nextLine();
		Product p = pr.getEntity(productId);
		if (p == null) {
			System.out.println("Esse produto n�o existe.");
			return 1;
		}
		s.setProductId(productId);
		p.addShelfId(shelfId);
	
		return 1;
	}

}
