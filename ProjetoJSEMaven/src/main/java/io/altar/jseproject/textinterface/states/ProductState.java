package io.altar.jseproject.textinterface.states;

import java.util.Collection;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductState extends State {
	private ProductRepository pr = ProductRepository.getInstance();

	@Override
	public int start() {
		showListProductsMenu();
		String op = sc.nextLine();
		return Integer.parseInt(op);
	}

	private void showListProductsMenu() {
		System.out.println("Menu Listar Produtos");
		showProductsList();
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Criar novo produto");
		System.out.println("2 - Editar um produto existente");
		System.out.println("3 - Consultar o detalhe de um produto");
		System.out.println("4 - Remover um produto");
		System.out.println("5 - Voltar ao ecrã anterior");
	}

	private void showProductsList() {
		Collection<Product> productsList = pr.getAllEntitiesByCollection();
		if (productsList.size() == 0) {
			System.out.println("Sem produtos a mostrar.");
		}
		for (Product p : productsList) {
			System.out.println(p);
		}
	}


}
