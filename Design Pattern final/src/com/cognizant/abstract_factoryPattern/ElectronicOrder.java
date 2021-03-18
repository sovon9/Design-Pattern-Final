package com.cognizant.abstract_factoryPattern;

public class ElectronicOrder extends Order{

	/**
	 * 
	 * @param channel channel type of channel used for booking
	 */
	public ElectronicOrder(Channel channel) {
		super(channel, ProductType.ELECTRONIC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		
		System.out.println(getChannel().channelType()+" "+productType);
		
	}


}
