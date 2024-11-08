package com.example.mohamedJava.structuralTp;

public class Demo {

	public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();
        NotificationSender pushSender = new PushSender();

        Message alertEmail = new Message.AlertMessage(emailSender);
        alertEmail.sendMessage();

        Message promoSMS = new Message.PromotionMessage(smsSender);
        promoSMS.sendMessage();

        Message infoPush = new Message.InfoMessage(pushSender);
        infoPush.sendMessage();
    }
}
