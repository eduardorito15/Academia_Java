package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class CreateProductState extends State {
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		System.out.println("Preencha a seguinte informação");
		System.out.println("Descrição do produto:");
		String description = sc.nextLine();
		System.out.println("PVP:");
		double pvp = sc.nextDouble();
		System.out.println("IVA:");
		double iva = sc.nextDouble();
		System.out.println("Desconto unitário:");
		double discount = sc.nextDouble();
		Product p = new Product(description, pvp, iva, discount);
		pr.addEntity(p);
		sc.nextLine();
		return 1;
	}

}
