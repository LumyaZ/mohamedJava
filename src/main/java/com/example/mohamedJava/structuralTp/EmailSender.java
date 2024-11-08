package com.example.mohamedJava.structuralTp;

public class EmailSender implements NotificationSender {

	@Override
	public void send(String message) {
		System.out.println("Email send : " + message);		
	}

}
