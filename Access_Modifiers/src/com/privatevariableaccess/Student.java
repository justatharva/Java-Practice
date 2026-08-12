package com.privatevariableaccess;

public class Student {
	
	private int marks = 85;// This is Instance Variable
	
	public static void main(String[] args) { // Static method access instance variable through an object
		/*int marks = 85; // This is Local Variable
		System.out.println(marks); // ❌ Non-static variable cannot be referenced from a static context*/
		Student s = new Student();
		System.out.println(s.marks);
	}
}
/* We must have to create object to access instance variable in static method */

/* 
 	Situation											Accessible?
	Inside the same class								✔ Yes
	Inside another class								❌ No (private)
	Static method accessing instance variable directly	❌ No
	Static method accessing through object				✔ Yes
*/