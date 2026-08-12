package com.abstractclass;

abstract class Shape{
	abstract void area();
}

class Circle extends Shape{
	public void area() {
		System.out.println("Area = Pi * r * r");
	}
}

class Rectangle extends Shape{
	public void area() {
		System.out.println("Area = Length * Breadth");
	}
}

public class ShapeArea {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.area();
		r.area();
	}
}

/*Logic

Common behavior → area()

Different implementation for every shape.
*/
