package com.cognizant.abstract_factoryPattern;

public class Main {

	public static void main(String[] args) {

		// getting desired object using abstract factory
		Order order=Orderfactory.getFactory("electronic",new E_commerce());
		Order order1=Orderfactory.getFactory("furniture",new E_commerce());
		Order order2=Orderfactory.getFactory("toy",new E_commerce());
		
		Order order3=Orderfactory.getFactory("electronic",new Tele());
		Order order4=Orderfactory.getFactory("furniture",new Tele());
		Order order5=Orderfactory.getFactory("toy",new Tele());
		
		// placing the order
		order.processOrder();
		order1.processOrder();
		order2.processOrder();
		
		order3.processOrder();
		order4.processOrder();
		order5.processOrder();
		
	}

}
