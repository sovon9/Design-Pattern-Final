package com.cognizant.EventOrganiser;

public interface Observer {

	/**
	 *  updates the message in every observer
	 * @param m Message object
	 */
	public void update(Message m);
	
}
