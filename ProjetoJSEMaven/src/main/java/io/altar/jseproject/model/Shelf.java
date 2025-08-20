package io.altar.jseproject.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name=Shelf.GET_ALL_SHELVES, query="SELECT s FROM Shelf s"),
	@NamedQuery(name=Shelf.GET_COUNT_SHELVES, query="SELECT COUNT(s.id) FROM Shelf s")
})
public class Shelf extends Entity_ {
	private int shelfCapacity;
	@ManyToOne
	private Product product;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getDailyLocationRentalPrice() {
		return dailyLocationRentalPrice;
	}

	public void setDailyLocationRentalPrice(double dailyLocationRentalPrice) {
		this.dailyLocationRentalPrice = dailyLocationRentalPrice;
	}

	@Override
	public String toString() {
		return "Shelf [Id=\"" + getEntityId() + "\", shelfCapacity=\"" + shelfCapacity + "\", productId=\"" + product.getEntityId() + "\", dailyLocationRentalPrice=\"" + dailyLocationRentalPrice + "\"]";
	}

}
