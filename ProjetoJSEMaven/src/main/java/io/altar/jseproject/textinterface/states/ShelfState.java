package io.altar.jseproject.textinterface.states;

import java.util.Collection;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfState extends State {
	private ShelfRepository sr = ShelfRepository.getInstance();

	@Override
	public int start() {
		showListShelvesMenu();
		String op = sc.nextLine();
		return Integer.parseInt(op);
	}

	private void showListShelvesMenu() {
		System.out.println("Menu Listar Prateleiras");
		showShelvesList();
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Criar nova prateleira");
		System.out.println("2 - Editar uma prateleira existente");
		System.out.println("3 - Consultar o detalhe de uma prateleira");
		System.out.println("4 - Remover uma prateleira");
		System.out.println("5 - Adicionar produto à prateleira.");
		System.out.println("6 - Voltar ao ecrã anterior");
	}

	private void showShelvesList() {
		Collection<Shelf> shelvesList = sr.getAllEntitiesByCollection();
		if (shelvesList.size() == 0) {
			System.out.println("Sem prateleiras a mostrar.");
			return;
		}
		for (Shelf s : shelvesList) {
			System.out.println(s);
		}
	}


}
