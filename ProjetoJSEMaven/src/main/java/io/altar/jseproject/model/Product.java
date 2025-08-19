package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name=Product.GET_ALL_PRODUCTS, query="SELECT p FROM Product p"),
	@NamedQuery(name=Product.GET_COUNT_PRODUCTS, query="SELECT COUNT(p.id) FROM Product p")
})
public class Product extends Entity_ {
	private String productDescription;
	@ElementCollection
	private List<Integer> shelfIds = new ArrayList<Integer>();
	private double unitDiscount;
	private double productIVA;
	private double productPVP;
	public static final String GET_ALL_PRODUCTS = "getAllProducts";
	public static final String GET_COUNT_PRODUCTS = "getCountProducts";

	public Product() {

	}

	public Product(String productDescription, double productPVP, double productIVA, double unitDiscount) {
		this.productDescription = productDescription;
		this.productPVP = productPVP;
		this.productIVA = productIVA;
		this.unitDiscount = unitDiscount;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getUnitDiscount() {
		return unitDiscount;
	}

	public void setUnitDiscount(double unitDiscount) {
		this.unitDiscount = unitDiscount;
	}

	public double getProductIVA() {
		return productIVA;
	}

	public void setProductIVA(double productIVA) {
		this.productIVA = productIVA;
	}

	public double getProductPVP() {
		return productPVP;
	}

	public void setProductPVP(double productPVP) {
		this.productPVP = productPVP;
	}

	public List<Integer> getShelfIds() {
		return shelfIds;
	}

	public void addShelfId(int id) {
		shelfIds.add(id);
	}

	public void removeShelfId(int id) {
		shelfIds.remove(id);
	}

	@Override
	public String toString() {
		return "Product [Id=\"" + getEntityId() + "\", productDescription=\"" + productDescription + "\", productIVA=\""
				+ productIVA + "\", productPVP=\"" + productPVP + "\", shelfIds=\"" + shelfIds + "\", unitDiscount=\""
				+ unitDiscount + "\"]";
	}

}
