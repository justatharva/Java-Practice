package com.overriding_method;

class Payment{
	void payment() {
		System.out.println("Paid Via Cash");
	}
}

class CreditCard extends Payment{
	void payment() {
		System.out.println("Paid via Credit Card");
	}
}

class UPI extends Payment{
	void payment() {
		System.out.println("Paid via UPI");
	}
}

class PayPal extends Payment{
	void payment() {
		System.out.println("Paid via PayPal");
	}
}

public class PaymentType {
	public static void main(String[] args) {
		Payment p;
		p = new CreditCard();
		p.payment();
		p = new UPI();
		p.payment();
		p = new PayPal();
		p.payment();
	}
}
