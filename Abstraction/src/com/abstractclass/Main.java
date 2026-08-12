package com.abstractclass;

abstract class Animal{
	abstract void makeSound();
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog makes Barking Sound");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat Makes Meow Sound");
	}
}

public class Main {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.makeSound();
		c.makeSound();
	}
}

/* Logic
 * Every Animal must make a sound
 * The Sound depends on the animal
*/
