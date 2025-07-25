package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class EditProductState extends State {
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		// TODO Auto-generated method stub
		if (pr.getSize() == 0) {
			System.out.println("A lista de produtos est� vazia.");
		} else {
			System.out.println("Introduza o ID do produto que pretende editar.");
			int id = sc.nextInt();
			Product p = pr.getEntity(id);
			if (p == null) {
				System.out.println("Produto n�o encontrado.");
			} else {
				sc.nextLine();
				System.out.println("Descri��o do produto:");
				String description = sc.nextLine();
				if (!description.equals("")) {
					p.setProductDescription(description);
				}
				System.out.println("PVP:");
				double pvp = sc.nextDouble();
				if (pvp != 0) {
					p.setProductPVP(pvp);
				}
				System.out.println("IVA:");
				double iva = sc.nextDouble();
				if (iva != 0) {
					p.setProductIVA(iva);
				}
				System.out.println("Desconto unit�rio:");
				double discount = sc.nextDouble();
				if (discount != 0) {
					p.setUnitDiscount(discount);
				}
			}
			pr.editEntity(p);
			sc.nextLine();
		}
		return 1;
	}

}
