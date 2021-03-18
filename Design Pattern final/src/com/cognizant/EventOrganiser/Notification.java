package com.cognizant.EventOrganiser;

public interface Notification {

	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyAll(Message message);
}
