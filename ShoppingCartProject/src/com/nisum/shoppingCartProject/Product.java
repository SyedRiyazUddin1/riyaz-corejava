package com.nisum.shoppingCartProject;

public class Product {
	
	private int productId;
	private String productName;
	private double price;

	// creating a constructor with parameters

	public Product(Integer productId, String productName, Integer price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String getName() {
		return productName;
	}

	public void setName(String productName) {
		this.productName = productName;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getproductId() {
		return productId;
	}

	public String toString() {
		return "Products: productId=" + productId + " productName=" + productName + " price =" + price;
	}
}
