package com.example.mohamedJava.structuralTest.adapter.exo2;

public class NotificationAdapter implements SmsService {
    private EmailService emailService;

    public NotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendSms(String number, String message) {
        String email = convertPhoneToEmail(number);
        
        String subject = "Notification";
        String body = message;
        emailService.sendEmail(email, subject, body);
    }
    
    private String convertPhoneToEmail(String phoneNumber) {
        return phoneNumber + "@example.com";
    }

}
