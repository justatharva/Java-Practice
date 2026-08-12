package com.multilevel_inheritance;

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

class Puppy extends Dog{
	void weep(){
		System.out.println("Puppy is Weeping");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}
