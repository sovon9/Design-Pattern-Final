package com.cognizant.abstract_factoryPattern;

public class FurnitureOrder extends Order{

	/**
	 * 
	 * @param channel type of channel used for booking
	 */
	public FurnitureOrder(Channel channel) {
		super(channel, ProductType.FURNITURE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		
		System.out.println(getChannel().channelType()+" "+productType);
		
	}

}
