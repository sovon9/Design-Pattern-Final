package com.cognizant.abstract_factoryPattern;

public class ToysOrder extends Order{

	/**
	 * 
	 * @param channel type of channel used for booking
	 */
	public ToysOrder(Channel channel) {
		super(channel, ProductType.TOYS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		
		System.out.println(getChannel().channelType()+" "+productType);
		
	}


}
