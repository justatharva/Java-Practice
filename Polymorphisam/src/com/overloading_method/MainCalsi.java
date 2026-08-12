package com.overloading_method;

class Calculator{
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class MainCalsi {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(5, 2));
		System.out.println(c.add(14, 15, 16));
		System.out.println(c.add(4.55, 9.32));
	}
}

/*Calculator

        add()

     /      |        \
int,int  int,int,int  double,double
Compiler checks the arguments and chooses the correct method.
s*/