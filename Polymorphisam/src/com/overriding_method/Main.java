package com.overriding_method;

class Animal{
	void sound() {
		System.out.println("Animals make sounds.");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Cat Meow");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.sound();
		a2.sound();
	}
}


/*Why Use Parent References?

Instead of

Dog d = new Dog();

Cat c = new Cat();

Use

Animal a;

a = new Dog();

a = new Cat();

This makes code flexible.
*/