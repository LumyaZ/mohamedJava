package com.example.mohamedJava.structuralTp;

public class PushSender implements NotificationSender {

	@Override
	public void send(String message) {
		System.out.println("Push send : " + message);		
		
	}

}
