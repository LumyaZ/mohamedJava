package com.example.mohamedJava.structuralTp;

public class SMSSender implements NotificationSender {

	@Override
	public void send(String message) {
		System.out.println("SMS send : " + message);		
		
	}

}
