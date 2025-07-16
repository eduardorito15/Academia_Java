package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private static int countId;
	private int productId;
	private String productDescription;
	private List<Integer> shelfIds = new ArrayList<Integer>();
	private double unitDiscount;
	private double productIVA;
	private double productPVP;

	public Product(String productDescription, double productPVP, double productIVA, double unitDiscount) {
		this.productId = this.countId++;
		this.productDescription = productDescription;
		this.productPVP = productPVP;
		this.productIVA = productIVA;
		this.unitDiscount = unitDiscount;
	}

	public int getProductId() {
		return productId;
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

}
