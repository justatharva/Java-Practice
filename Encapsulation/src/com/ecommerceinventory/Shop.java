package com.ecommerceinventory;

public class Shop {
	private int productId;
	private String productName;
	private double price;
	private int stock;
	
	Shop(int productId, String productName, double price, int stock){
		this.productId = productId;
		this.productName = productName;
		setPrice(price);
		setStock(stock);
	}

	public void sellStock(int quantity) {
		
		if(quantity <= 0)
			System.out.println("Stock can be greater than zero");
		else if(quantity > stock)
			System.out.println("Not Enough stock");
		else {			
			stock -= quantity;
			System.out.println(quantity + " product(s) sold.");
		}
		
	}
	
	public void addStock(int quantity) {
		if(quantity > 0) {
			stock += quantity;
			System.out.println(quantity+" Stocks Added...");
		}
		else {
			System.out.println("Invalid Quantity..");
		}
	}
	
	public void setStock(int stock) {
		if(stock>0) {
			this.stock += stock;
		}
		else {
			System.out.println("Stock Cannot be negative");
		}
	}

	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
			System.out.println("Price Cannot be negative");
		}
	}
	
	public int getProductId(){
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getProductPrice() {
		return price;
	}
	
	public int getProductStock() {
		return stock;
	}
}
