package com.cognizant.EventOrganiser;

public class Main {

	public static void main(String[] args) {
		
		Notification notification=new NotificationService();
		
		// creating event object
		Event event=new Event("Birthday", "celebration");
		
		Observer o1=new Admin1();
		Observer o2=new Admin2();
		
		// Admin1 and Admin2 is subscribed to notification service 
		notification.attach(o1);
		notification.attach(o2);
		
		EventRegistrationService eventRegistrationService=new EventRegistrationService();
		
		eventRegistrationService.bookEvent(notification, event, 50);
		
		eventRegistrationService.bookEvent(notification, event, 60);
		
		Event event1=new Event("Marriage", "celebration");
		
		// Admin2 is unsubscribed from notification service
		// so Admin2 will not receive notification
		notification.detach(o2);
		
		eventRegistrationService.bookEvent(notification, event1, 90);
		eventRegistrationService.bookEvent(notification, event1, 12);
		
	}

}
