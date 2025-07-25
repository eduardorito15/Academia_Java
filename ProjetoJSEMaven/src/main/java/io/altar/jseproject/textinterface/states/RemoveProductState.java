package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class RemoveProductState extends State {
	private ProductRepository pr = ProductRepository.getInstance();
	private ShelfRepository sr = ShelfRepository.getInstance();

	@Override
	public int start() {
		// TODO Auto-generated method stub
		if (pr.getSize() == 0) {
			System.out.println("A lista de produtos est� vazia.");
			return 1;
		}
		System.out.println("Introduza o ID do produto que pretende remover.");
		int id = sc.nextInt();
		sc.nextLine();
		Product p = pr.getEntity(id);
		if (p == null) {
			System.out.println("Produto n�o encontrado.");
			return 1;
		}
		System.out.println("Tem a certeza que pretende remover " + p.getProductDescription() + "? (s/n)");
		String r = sc.nextLine().trim().toLowerCase();
		if (r.equals("s") || r.equals("sim")) {
			if (!p.getShelfIds().isEmpty()) {
				for (int shelfId : p.getShelfIds()) {
					removeProductFromShelf(shelfId);
				}
			}
			pr.removeEntity(id);
			System.out.println(p.getProductDescription() + " removido com sucesso.");
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
