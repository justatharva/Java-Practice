package com.interfacetype;

interface Drivable{
	void drive();
}

public class Bike implements Drivable{

	@Override
	public void drive() {
		System.out.println("Bike is Driving");
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.drive();
	}
	// Every class that is Drivable must provide a drive() method.
}
