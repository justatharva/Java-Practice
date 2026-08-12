package com.hybrid_inheritance;

// Base Class
class Vehicle{
	void start() {
		System.out.println("Engine Started");
	}
}

// Interface 1
interface Drivable{
	void drive();
}

//Interface 2
interface Sailable{
	void sail();
}

//Hybrid Inheritance: Extends 1 class and Implements 2 interfaces
class AmphibiousCar extends Vehicle implements Drivable, Sailable{

	@Override
	public void sail() {
		System.out.println("Driving on land");
	}

	@Override
	public void drive() {
		System.out.println("Sailing on water");
	}
	
	void transform() {
		System.out.println("Switching Modes!");
	}
}

public class Hybrid_Inheritance {
	public static void main(String[] args) {
		AmphibiousCar mycar = new AmphibiousCar();
		mycar.start();	// Inherited from Vehicle class
		mycar.drive();	// Implemented from Drivable interface
		mycar.sail();	// Implemented from sailable interface
		mycar.transform();	// Defined in AmphibiousCar
	}
}
