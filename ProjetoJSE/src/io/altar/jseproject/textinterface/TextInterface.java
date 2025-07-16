package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {
	private static Scanner sc = new Scanner(System.in);

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
				System.out.println("Por favor introduza uma opção válida.");
				break;
			}
		} while (!op.equals("3"));
	}

	private void showMainMenu() {
		System.out.println("Menu Principal");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Listar produtos");
		System.out.println("2 - Listar prateleiras");
		System.out.println("3 - Sair");
	}

	public void listProductsMenu() {
		// TODO Mostrar lista de produtos
		String op;
		do {
			showListProductsMenu();
			op = sc.nextLine();
			switch (op) {
			case "1":
				System.out.println("Por implementar: criar novo produto");
				break;
			case "2":
				System.out.println("Por implementar - Editar um produto existente");
				break;
			case "3":
				System.out.println("Por implementar - Consultar o detalhe de um produto");
				break;
			case "4":
				System.out.println("Por implementar - Remover um produto");
				break;
			case "5":
				break;
			default:
				System.out.println("Por favor introduza uma opção válida.");
				break;
			}
		} while (!op.equals("5"));
	}

	private void showListProductsMenu() {
		System.out.println("Menu Listar Produtos");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Criar novo produto");
		System.out.println("2 - Editar um produto existente");
		System.out.println("3 - Consultar o detalhe de um produto");
		System.out.println("4 - Remover um produto");
		System.out.println("5 - Voltar ao ecrã anterior");
	}

	public void listShelvesMenu() {
		// TODO Mostrar lista de prateleiras
		String op;
		do {
			showListShelvesMenu();
			op = sc.nextLine();
			switch (op) {
			case "1":
				System.out.println("Por implementar - criar nova prateleira");
				break;
			case "2":
				System.out.println("Por implementar - Editar uma prateleira existente");
				break;
			case "3":
				System.out.println("Por implementar - Consultar o detalhe de uma prateleira");
				break;
			case "4":
				System.out.println("Por implementar - Remover uma prateleira");
				break;
			case "5":
				break;
			default:
				System.out.println("Por favor introduza uma opção válida.");
				break;
			}
		} while (!op.equals("5"));
	}

	private void showListShelvesMenu() {
		System.out.println("Menu Listar Prateleiras");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Criar nova prateleira");
		System.out.println("2 - Editar uma prateleira existente");
		System.out.println("3 - Consultar o detalhe de uma prateleira");
		System.out.println("4 - Remover uma prateleira");
		System.out.println("5 - Voltar ao ecrã anterior");
	}

	public static void main(String[] args) {
		TextInterface main = new TextInterface();
		main.mainMenu();
	}
}
