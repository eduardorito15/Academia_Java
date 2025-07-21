package io.altar.jseproject.textinterface;

import java.util.Collection;
import java.util.Scanner;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class TextInterface {
	private static Scanner sc = new Scanner(System.in);
	ProductRepository pr = ProductRepository.getInstance(); // chama uma inst�ncia de ProductRepository, usada para
															// manipular produtos atrav�s da classe concreta

	public void mainMenu() {
		String op;
		do {
			showMainMenu();
			op = sc.nextLine();
			switch (op) {
			case "1":
				listProductsMenu();
				break;
			case "2":
				listShelvesMenu();
				break;
			case "3":
				System.out.println("Obrigado.");
				break;
			default:
				System.out.println("Por favor introduza uma op��o v�lida.");
				break;
			}
		} while (!op.equals("3"));
	}

	private void showMainMenu() {
		System.out.println("Menu Principal");
		System.out.println("Por favor selecione uma das seguintes op��es:");
		System.out.println("1 - Listar produtos");
		System.out.println("2 - Listar prateleiras");
		System.out.println("3 - Sair");
	}

	public void listProductsMenu() {
		String op;
		do {
			showListProductsMenu();
			op = sc.nextLine();
			switch (op) {
			case "1":
				createProduct();
				break;
			case "2":
				editProduct();
				break;
			case "3":
				viewProductDetails();
				break;
			case "4":
				removeProduct();
				break;
			case "5":
				break;
			default:
				System.out.println("Por favor introduza uma op��o v�lida.");
				break;
			}
		} while (!op.equals("5"));
	}

	private void showListProductsMenu() {
		System.out.println("Menu Listar Produtos");
		showProductsList();
		System.out.println("Por favor selecione uma das seguintes op��es:");
		System.out.println("1 - Criar novo produto");
		System.out.println("2 - Editar um produto existente");
		System.out.println("3 - Consultar o detalhe de um produto");
		System.out.println("4 - Remover um produto");
		System.out.println("5 - Voltar ao ecr� anterior");
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

	public void listShelvesMenu() {
		// TODO Mostrar lista de prateleiras
		String op;
		do {
			showListShelvesMenu();
			op = sc.nextLine();
			switch (op) {
			case "1":
				// TODO Criar nova prateleira
				System.out.println("Por implementar - criar nova prateleira");
				break;
			case "2":
				// TODO Editar uma prateleira existente
				System.out.println("Por implementar - Editar uma prateleira existente");
				break;
			case "3":
				// TODO Consultar o detalhe de uma prateleira
				System.out.println("Por implementar - Consultar o detalhe de uma prateleira");
				break;
			case "4":
				// TODO Remover uma prateleira
				System.out.println("Por implementar - Remover uma prateleira");
				break;
			case "5":
				break;
			default:
				System.out.println("Por favor introduza uma op��o v�lida.");
				break;
			}
		} while (!op.equals("5"));
	}

	private void showListShelvesMenu() {
		System.out.println("Menu Listar Prateleiras");
		System.out.println("Por favor selecione uma das seguintes op��es:");
		System.out.println("1 - Criar nova prateleira");
		System.out.println("2 - Editar uma prateleira existente");
		System.out.println("3 - Consultar o detalhe de uma prateleira");
		System.out.println("4 - Remover uma prateleira");
		System.out.println("5 - Voltar ao ecr� anterior");
	}

	private void createProduct() {
		System.out.println("Preencha a seguinte informa��o");
		System.out.println("Descri��o do produto:");
		String description = sc.nextLine();
		System.out.println("PVP:");
		double pvp = sc.nextDouble();
		System.out.println("IVA:");
		double iva = sc.nextDouble();
		System.out.println("Desconto unit�rio:");
		double discount = sc.nextDouble();
		Product p = new Product(description, pvp, iva, discount);
		pr.addEntity(p);
		sc.nextLine();
	}

	private void editProduct() {
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
	}

	private void removeProduct() {
		if (pr.getSize() == 0) {
			System.out.println("A lista de produtos est� vazia.");
			return;
		}
		System.out.println("Introduza o ID do produto que pretende remover.");
		int id = sc.nextInt();
		sc.nextLine();
		Product p = pr.getEntity(id);
		if (p == null) {
			System.out.println("Produto n�o encontrado.");
			return;
		}
		System.out.println("Tem a certeza que pretende remover " + p.getProductDescription() + "? (s/n)");
		String r = sc.nextLine().trim().toLowerCase();
		if (r.equals("s") || r.equals("sim")) {
			pr.removeEntity(id);
			System.out.println(p.getProductDescription() + " removido com sucesso.");
		} else {
			System.out.println("Op��o inv�lida. Remo��o cancelada.");
		}
	}

	private void viewProductDetails() {
		if (pr.getSize() == 0) {
			System.out.println("A lista de produtos est� vazia.");
			return;
		}
		System.out.println("Introduza o ID do produto que pretende consultar.");
		int id = sc.nextInt();
		sc.nextLine();
		Product p = pr.getEntity(id);
		if (p == null) {
			System.out.println("Produto n�o encontrado.");
			return;
		}
		String details = String.format(
				"Id do produto: %d\nDescri��o: %s\nPVP: %.2f �\nIVA: %.2f %%\nDesconto unit�rio: %.2f %%\nPrateleiras: %s",
				p.getEntityId(), p.getProductDescription(), p.getProductPVP(), p.getProductIVA(), p.getUnitDiscount(),
				p.getShelfIds());
		System.out.println(details);
	}

	public static void main(String[] args) {
		TextInterface main = new TextInterface();
		main.mainMenu();
	}
}
