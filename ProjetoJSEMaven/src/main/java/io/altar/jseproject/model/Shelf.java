package io.altar.jseproject.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name=Shelf.GET_ALL_SHELVES, query="SELECT s FROM Shelf s"),
	@NamedQuery(name=Shelf.GET_COUNT_SHELVES, query="SELECT COUNT(s.id) FROM Shelf s")
})
public class Shelf extends Entity_ {
	private int shelfCapacity;
	//FIXME Change int productId to Product product
	private int productId = -1;
	private double dailyLocationRentalPrice;
	public static final String GET_ALL_SHELVES = "getAllShelves";
	public static final String GET_COUNT_SHELVES = "getCountShelves";

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
