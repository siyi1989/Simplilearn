package com.example;

public class Widget implements SalesCalcs {

	private String name ="Widget";
	private double salesPrice =0;
	private double cost =0;
	private long quantity=0;
	
	
	
	//source>generate constructor using fields (exclude name)
	public Widget(double salesPrice, double cost, long quantity) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.quantity = quantity;
	}

	//under error-click on add methods to autogenerate
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		// TODO Auto-generated method stub
		return this.salesPrice*this.quantity;
	}

	@Override
	public double calcCost() {
		// TODO Auto-generated method stub
		return this.cost*this.quantity;
	}

	@Override
	public double calcProfit() {
		// TODO Auto-generated method stub
		return this.calcSalesPrice()-this.calcCost();
	}

	
}
