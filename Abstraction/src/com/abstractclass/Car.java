package com.abstractclass;

//Abstract Class
abstract class Vehicle{		//It defines what every vehicle should do 
	//Abstract method		//It doesn't define how the engine starts
	abstract void startEngine();
	
	//Normal method
	void stopEngine() {
		System.out.println("Engine Stopped");
	}
}

public class Car extends Vehicle{		//Car provides he actual implementation

	@Override
	void startEngine() {
		System.out.println("Engine Started");		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		
		c.startEngine();
		c.stopEngine();
	}
	
}
