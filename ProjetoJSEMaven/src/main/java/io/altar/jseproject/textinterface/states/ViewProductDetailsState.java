package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ViewProductDetailsState extends State {
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		// TODO Auto-generated method stub
		if (pr.getSize() == 0) {
			System.out.println("A lista de produtos est� vazia.");
			return 1;
		}
		System.out.println("Introduza o ID do produto que pretende consultar.");
		int id = sc.nextInt();
		sc.nextLine();
		Product p = pr.getEntity(id);
		if (p == null) {
			System.out.println("Produto n�o encontrado.");
			return 1;
		}
		String details = String.format(
				"Id do produto: %d\nDescri��o: %s\nPVP: %.2f �\nIVA: %.2f %%\nDesconto unit�rio: %.2f %%\nPrateleiras: %s",
				p.getEntityId(), p.getProductDescription(), p.getProductPVP(), p.getProductIVA(), p.getUnitDiscount(),
				p.getShelfIds());
		System.out.println(details);
		return 1;
	}

}
