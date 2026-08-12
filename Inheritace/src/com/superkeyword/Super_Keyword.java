package com.superkeyword;

class Employee{
	String name;
	
	Employee(String name){
		this.name = name;;
	}
}

class Manager extends Employee{
	String department;
	
	Manager(String name, String department){
		super(name);
		this.department = department;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Dept : "+department);
	}
}

public class Super_Keyword {
	public static void main(String[] args) {
		Manager m = new Manager("Atharva","IT");
		m.display();
	}
}


/*
Thought Process

Whenever a child object is created, the parent part of the object must be initialized first. 
super(...) calls the parent constructor to perform that initialization, 
avoiding duplicate code.

*/