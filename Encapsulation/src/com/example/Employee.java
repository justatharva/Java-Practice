package com.example;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		setSalary(salary);
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Salary cannot be negative.");
		}
		
	}
	public int getEmployeeId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
}
