package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class RemoveShelfState extends State {
	private ShelfRepository sr = ShelfRepository.getInstance();
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		// TODO Auto-generated method stub
		if (sr.getSize() == 0) {
			System.out.println("A lista de prateleiras est� vazia.");
			return 1;
		}
		System.out.println("Introduza o ID da prateleira que pretende remover.");
		int id = sc.nextInt();
		sc.nextLine();
		Shelf s = sr.getEntity(id);
		if (s == null) {
			System.out.println("Prateleira n�o encontrada.");
			return 1;
		}
		System.out.println("Tem a certeza que pretende remover a prateleira " + s.getEntityId() + "? (s/n)");
		String r = sc.nextLine().trim().toLowerCase();
		if (r.equals("s") || r.equals("sim")) {
			removeProductFromShelf(id);
			sr.removeEntity(id);
			System.out.println("Prateleira " + s.getEntityId() + " removida com sucesso.");
		} else {
			System.out.println("Op��o inv�lida. Remo��o cancelada.");
		}
		return 1;
	}

	private void removeProductFromShelf(int shelfId) {
		Shelf s = sr.getEntity(shelfId);
		if (s.getProductId() != -1) {
			Product p = pr.getEntity(s.getProductId());
			p.removeShelfId(shelfId);
		}
	}


}
