package com.cognizant.EventOrganiser;

import java.util.ArrayList;
import java.util.List;

public class EventRegistrationService {

	private List<SeatBooking> seats=new ArrayList<>();
		
	/**
	 * 
	 * @param service of NotificationService Object
	 * @param e Event Object
	 * @param noOfSeats Number of Objects
	 */
	public void bookEvent(Notification service,Event e,int noOfSeats)
	{
		boolean i=false;
		for(SeatBooking sb:seats)
		{
			//System.out.println(sb.getEvent().getName()+" "+e.getName());
			if((sb.getEvent().getName()).equals(e.getName()))
			{
				int seat=sb.getNoOfSeatsBooked();
				//System.out.println("same event");
			    seat=seat+noOfSeats;
			    if(seat>100)
			    {
					service.notifyAll(new Message(seat+" seats are booked"));
			    }
			    sb.setNoOfSeatsBooked(seat);
			    i=true;
			    break;
			}
		}
		if(i==false)
		{
			System.out.println(e.getName()+" event registered");
			SeatBooking seatBooking=new SeatBooking(e, noOfSeats);
			seats.add(seatBooking);
		}
	}
	
}
