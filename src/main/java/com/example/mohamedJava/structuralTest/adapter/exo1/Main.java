package com.example.mohamedJava.structuralTest.adapter.exo1;

public class Main {
	public static void main(String[] args) {
        NewPaymentProcessor newPaymentProcessor = new NewPaymentProcessor();

        PaymentAdapter paymentAdapter = new PaymentAdapter(newPaymentProcessor, "12345-API-KEY");

        paymentAdapter.makePayment("987654321", 250.75);  
    }
}
