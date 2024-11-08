package com.example.mohamedJava.structuralTest.adapter.exo1;

public class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentProcessor newPaymentProcessor;
    private String apiKey;  

    public PaymentAdapter(NewPaymentProcessor newPaymentProcessor, String apiKey) {
        this.newPaymentProcessor = newPaymentProcessor;
        this.apiKey = apiKey;
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcessor.authenticate(apiKey);
        
        newPaymentProcessor.sendPayment(amount);
        
        System.out.println("Payment of " + amount + " has been processed for account: " + accountNumber);
    } 

}
