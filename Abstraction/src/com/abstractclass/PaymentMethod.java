package com.abstractclass;

abstract class Payment{
	abstract void payment();
}

class Online extends Payment{
	public void payment() {
		System.out.println("Paid via UPI");
	}
}

class Card extends Payment{
	public void payment() {
		System.out.println("Paid via Credit Card.");
	}
}

public class PaymentMethod {
	public static void main(String[] args) {
		Online o = new Online();
		Card c = new Card();
		
		o.payment();
		c.payment();
	}
}
