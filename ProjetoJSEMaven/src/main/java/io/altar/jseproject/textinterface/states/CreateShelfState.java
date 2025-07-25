package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class CreateShelfState extends State {
	private ShelfRepository sr = ShelfRepository.getInstance();

	@Override
	public int start() {
		// TODO Auto-generated method stub
		System.out.println("Preencha a seguinte informa��o.");
		System.out.println("Capacidade da prateleira:");
		int capacity = sc.nextInt();
		sc.nextLine();
		System.out.println("Pre�o de aluguer:");
		double price = sc.nextDouble();
		sc.nextLine();
		Shelf s = new Shelf();
		s.setShelfCapacity(capacity);
		s.setDailyLocationRentalPrice(price);
		sr.addEntity(s);
		return 1;
	}

}
