package com.training.assignment.four;

public class Q4_Product {
	private int productId;
	private String productName;
	private double productPrice;

	public Q4_Product(int id, String name, double price) {
		this.productId = id;
		this.productName = name;
		this.productPrice = price;
	}

	public double getProductPrice() {
		return productPrice;
	}

	@Override
	public String toString() {
		return productName + " (₹ " + productPrice + ")";
	}
}
