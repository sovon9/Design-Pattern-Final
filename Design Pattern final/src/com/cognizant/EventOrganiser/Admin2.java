package com.cognizant.EventOrganiser;

public class Admin2 implements Observer{

	/**
	 *  displays the message from NotificationService
	 */
	@Override
	public void update(Message m) {
		
		System.out.println("Message Admin2:: "+m.getMessage());
		
	}

}
