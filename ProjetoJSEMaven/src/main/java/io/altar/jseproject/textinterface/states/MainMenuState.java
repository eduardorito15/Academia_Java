package io.altar.jseproject.textinterface.states;

public class MainMenuState extends State {

	@Override
	public int start() {
		// TODO Auto-generated method stub
			showMainMenu();
			String op = sc.nextLine();
		return Integer.parseInt(op);
	}

	private void showMainMenu() {
		System.out.println("Menu Principal");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1 - Listar produtos");
		System.out.println("2 - Listar prateleiras");
		System.out.println("3 - Sair");
	}
}
