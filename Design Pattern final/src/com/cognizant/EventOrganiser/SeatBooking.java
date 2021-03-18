package com.cognizant.EventOrganiser;

public class SeatBooking {

	private Event event;
	
	private int noOfSeatsBooked;

	/**
	 * 
	 * @param event Event object
	 * @param noOfSeatsBooked  no of seats to be booked
	 */
	public SeatBooking(Event event, int noOfSeatsBooked) {
		super();
		this.event = event;
		this.noOfSeatsBooked = noOfSeatsBooked;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public int getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}

	public void setNoOfSeatsBooked(int noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}

	
}
