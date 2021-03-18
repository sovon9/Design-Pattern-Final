package com.cognizant.EventOrganiser;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Notification {

	private List<Observer> observers=new ArrayList<>();
	
	@Override
	public void attach(Observer o) {
		
		observers.add(o);

	}

	@Override
	public void detach(Observer o) {
		
		observers.remove(o);

	}

	@Override
	public void notifyAll(Message message) {
		
		for(Observer o:observers)
		{
			o.update(message);
		}

	}

}
