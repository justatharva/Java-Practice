package com.multiple_inheritance;

interface Camera{
	void click();
}

interface Music{
	void play();
}

class Phone implements Camera, Music{
	public void click() {
		System.out.println("Photo Clicked");
	}
	public void play() {
		System.out.println("Music Played");
	}
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.click();
		p.play();
	}
}
