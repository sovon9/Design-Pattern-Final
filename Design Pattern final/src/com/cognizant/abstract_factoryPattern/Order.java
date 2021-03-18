package com.cognizant.abstract_factoryPattern;

public abstract class Order {

	protected Channel channel;
	
	protected ProductType productType;
	
	/**
	 * 
	 * @param channel type of channel used for booking
	 * @param productType type of product (ELECTRONIC,FURNITURE,TOYS)
	 */
	public Order(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 *   process the received order
	 */
	public abstract void processOrder();
	
}
