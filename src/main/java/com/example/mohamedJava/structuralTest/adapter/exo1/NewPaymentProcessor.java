package com.example.mohamedJava.structuralTest.adapter.exo1;

public class NewPaymentProcessor {
	public void authenticate(String apiKey) {
        System.out.println("Authenticating with API key: " + apiKey);
    }

    public void sendPayment(double amount) {
        System.out.println("Sending payment of amount: " + amount);
    }
}
