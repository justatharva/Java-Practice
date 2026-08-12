package com.ecommerceinventory;

public class Product {
	public static void main(String[] args) {
		Shop sh = new Shop(101,"Pencil",20,25);
//		System.out.println(sh.getProductPrice());

//        sh.setPrice(65000);

//        System.out.println(sh.getProductPrice());

//        sh.setPrice(-10000);
		System.out.println("Current Stocks : "+sh.getProductStock());
        
        sh.setStock(5);
        
        System.out.println("Current Stocks : "+sh.getProductStock());
        
        sh.setStock(-25);
        
        sh.sellStock(35);
        
        System.out.println("Remaining Stocks : "+sh.getProductStock());
        
        sh.addStock(10);
        
        System.out.println("Current Stocks : "+sh.getProductStock());
	}
}
