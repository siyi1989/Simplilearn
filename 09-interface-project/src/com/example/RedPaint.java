package com.example;

public class RedPaint implements SalesCalcs {

	
	private String name="Red Paint";
	private double salesPrice=0;
	private double cost=0;
	private double gallons=0;
	
	
	public RedPaint(double salesPrice, double cost, double gallons) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.gallons = gallons;
	}

	//click on error to autogenerate methods below
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.salesPrice*this.gallons;
	}

	@Override
	public double calcCost() {
		return this.cost*this.gallons;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice()-this.calcCost();
	}

	
}
