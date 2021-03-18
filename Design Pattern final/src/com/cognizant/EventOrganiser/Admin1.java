package com.cognizant.EventOrganiser;

public class Admin1 implements Observer{

	/**
	 *   displays the message from NotificationService
	 */
	@Override
	public void update(Message m) {
		
		System.out.println("Message Admin1:: "+m.getMessage());
		
	}

}
