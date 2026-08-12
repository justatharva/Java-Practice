package com.example;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(101,"Rahul",50000);

        System.out.println(emp.getSalary());

        emp.setSalary(65000);

        System.out.println(emp.getSalary());

        emp.setSalary(-10000);
    }

}