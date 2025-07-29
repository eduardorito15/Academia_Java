package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.states.AddProductToShelfState;
import io.altar.jseproject.textinterface.states.CreateProductState;
import io.altar.jseproject.textinterface.states.CreateShelfState;
import io.altar.jseproject.textinterface.states.EditProductState;
import io.altar.jseproject.textinterface.states.MainMenuState;
import io.altar.jseproject.textinterface.states.ProductState;
import io.altar.jseproject.textinterface.states.RemoveProductState;
import io.altar.jseproject.textinterface.states.RemoveShelfState;
import io.altar.jseproject.textinterface.states.ShelfState;
import io.altar.jseproject.textinterface.states.State;
import io.altar.jseproject.textinterface.states.ViewProductDetailsState;

public class TextInterfaceStateMachine {
	private State[] states = { new MainMenuState(), new ProductState(), new ShelfState(), new CreateProductState(),
			new EditProductState(), new ViewProductDetailsState(), new RemoveProductState(), new CreateShelfState(),
			new RemoveShelfState(), new AddProductToShelfState() };
	private int[][] transitions = { { 1, 2 }, // state 0 MainMenuState()
			{ 3, 4, 5, 6, 0 }, // state 1 ProductState()
			{ 7, 8, 9, 0}, // state 2 ShelfState()
			{ 1 }, // state 3 CreateProductState()
			{ 1 }, // state 4 EditProductState()
			{ 1 }, // state 5 ViewProductDetailsState()
			{ 1 }, // state 6 RemoveProductState()
			{ 2 }, // state 7 CreateShelfState()
			{ 2 }, // state 8 RemoveShelfState()
			{2} // state 9 AddProductToShelf()
	};
	private int current = 0;

	/*
	 * No array de arrays transitions, o array principal, que apenas possui os
	 * �ndices 0, 1 e 2, representa os tr�s menus poss�veis: 0 - menu principal; 1 -
	 * menu produtos; 2 - menu prateleiras. Cada um dos arrays internos cont�m as
	 * v�rias transi��es poss�veis, cujo valor num�rico corresponde � posi��o
	 * (index) em states[]. Por exemplo, new CreateProductState() encontra-se no
	 * index 3.
	 */
	public void start() {
		while (true) {
			int option = states[current].start();
			if (option == 3 && current == 0) {
				System.out.println("Obrigado!");
				break;
			}
			current = transitions[current][option - 1];

		}
	}
}
