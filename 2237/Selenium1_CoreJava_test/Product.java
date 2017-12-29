package com.htc.corejava.exam;

public class Product {

	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel=10;
	private int reorderQty=50;
	
	
	
	public Product(int productId, String productName, double price, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
	}
	
	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		reorderLevel=10;
		this.reorderLevel = reorderLevel;
	}

	public int getReorderQty() {
		this.reorderQty=reorderQty+50;
		return reorderQty;
	}

	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}
	
	
	
}
