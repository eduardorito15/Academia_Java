package io.altar.jseproject.textinterface;

import io.altar.jseproject.textinterface.states.CreateProductState;
import io.altar.jseproject.textinterface.states.MainMenuState;
import io.altar.jseproject.textinterface.states.ProductState;
import io.altar.jseproject.textinterface.states.ShelfState;
import io.altar.jseproject.textinterface.states.State;

public class TextInterfaceStateMachine {
	private State[] states = { new MainMenuState(),
			new ProductState(),
			new ShelfState(),
			new CreateProductState() };
	private int[][] transitions = { { 1, 2 }, // state 0
			{ 3, 1, 1, 1, 0 }, // state 1
			{ 2, 2, 2, 2, 2, 0 }, // state 2
			{1} // state 3 - CreateProductState()
			};
	private int current = 0;
/* No array de arrays transitions, o array principal, que apenas possui os índices 0, 1 e 2,  representa os três menus possíveis: 
 * 0 - menu principal;
 * 1 - menu produtos;
 * 2 - menu prateleiras.
 * Cada um dos arrays internos contém as várias transições possíveis, cujo valor numérico corresponde à posição (index) em states[]. Por exemplo, new CreateProductState() encontra-se no index 3.
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
