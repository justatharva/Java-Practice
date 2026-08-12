package com.abstractclass;

abstract class Login {

    void authenticate() {
    	System.out.println("Verified");
    }
}

// Abstract class can not required default keyword to execute their by default methods

class GoogleLogin extends Login {

    void authenticate() {
        System.out.println("Logged in using Google");
    }
}

class FacebookLogin extends Login {

    void authenticate() {
        System.out.println("Logged in using Facebook");
    }
}

class LoginSystem{
	public static void main(String[] args) {
		GoogleLogin g = new GoogleLogin();
		FacebookLogin f = new FacebookLogin();
		
		g.authenticate();
		f.authenticate();
	}
}