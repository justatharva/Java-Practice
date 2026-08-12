package com.hierarchical_inheritance;

class Animal{
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Cat is Meowing");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		d.bark();
		
		c.eat();
		c.meow();
	}
}
