package com.cognizant.abstract_factoryPattern;

public class Orderfactory {

	public static Order getFactory(String type,Channel channel)
	{
		// for ecommerce communication channel
			if(type.equalsIgnoreCase("electronic"))
			{
				return new ElectronicOrder(channel);
			}
			else if(type.equalsIgnoreCase("furniture"))
			{
				return new FurnitureOrder(channel);
			}
			else if(type.equalsIgnoreCase("toy"))
			{
				return new ToysOrder(channel);
			}
		return null;
	}
	
}
