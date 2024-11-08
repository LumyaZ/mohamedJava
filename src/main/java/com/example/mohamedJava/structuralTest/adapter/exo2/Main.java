package com.example.mohamedJava.structuralTest.adapter.exo2;

public class Main {
	public static void main(String[] args) {
        EmailService emailService = new EmailService();

        SmsService smsService = new NotificationAdapter(emailService);

        smsService.sendSms("1234567890", "This is a test notification message.");
    }
}
