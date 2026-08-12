package com.privatemethodaccess;

public class Calculator {
	private int add(int a, int b) {		//add() is Non-Static (instance) Method
		return a+b;
	}
	
	public void calculate() {
		System.out.println(add(10,20));
	}
	
	public static void main(String[] args) {	// main() is Static Method
		Calculator c = new Calculator();
		c.calculate();
		//add(30,30);
	}
}

/* 	Reason				Explanation
	main() is static	It belongs to the class.
	add() is non-static	It belongs to an object.
	add() is private	It can only be accessed inside the Calculator class. 
*/
