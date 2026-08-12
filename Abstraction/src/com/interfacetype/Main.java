package com.interfacetype;

interface Drivable1 {
    default void drive() {
    	System.out.println("Driving");
    }
}

//To use by default method execution we use default keyword in interface

class Car implements Drivable1 {

    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike1 implements Drivable1 {

    public void drive() {
        System.out.println("Bike is driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();
        Bike1 b = new Bike1();

        c.drive();
        b.drive();
    }
}