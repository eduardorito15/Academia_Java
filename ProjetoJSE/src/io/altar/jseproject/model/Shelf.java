package io.altar.jseproject.model;

public class Shelf extends Entity_ {
	private int shelfCapacity;
	private int productId = -1;
	private double dailyLocationRentalPrice;

	public Shelf() {

	}

	public Shelf(int productId, int shelfCapacity, double dailyLocationRentalPrice) {
		this.shelfCapacity = shelfCapacity;
		this.dailyLocationRentalPrice = dailyLocationRentalPrice;
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

	@Override
	public String toString() {
		return "Shelf [Id=\"" + getEntityId() + "\", shelfCapacity=\"" + shelfCapacity + "\", productId=\"" + productId + "\", dailyLocationRentalPrice=\"" + dailyLocationRentalPrice + "\"]";
	}

}
