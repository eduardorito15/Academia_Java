package io.altar.jseproject.model;

public class Shelf {
	private static int countId;
	private int shelfId;
	private int shelfCapacity;
	private int productId;
	private double dailyLocationRentalPrice;

	public Shelf() {

	}

	public Shelf(int productId, int shelfCapacity, double dailyLocationRentalPrice) {
		this.shelfId = this.countId++;
		this.productId = productId;
		this.shelfCapacity = shelfCapacity;
		this.dailyLocationRentalPrice = dailyLocationRentalPrice;
	}

	public int getShelfId() {
		return shelfId;
	}

	public int getShelfCapacity() {
		return shelfCapacity;
	}

	public void setShelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getDailyLocationRentalPrice() {
		return dailyLocationRentalPrice;
	}

	public void setDailyLocationRentalPrice(double dailyLocationRentalPrice) {
		this.dailyLocationRentalPrice = dailyLocationRentalPrice;
	}

}
