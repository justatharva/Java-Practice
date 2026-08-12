package com.single_level_inheritance;

class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking");
	}
}

public class Single_Level_Inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();	// Inherited Method
		d.bark();	// Own Method
	}
}
