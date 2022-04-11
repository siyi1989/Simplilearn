package com.example;

public class CrushedRock implements SalesCalcs {
	
	private String name="Crushed Rock";
	private double salesPrice=0;
	private double cost=0;
	private double weight=0; //in pounds
	
	//source>generate constructor using fields (exclude name)
	public CrushedRock(double salesPrice, double cost, double weight) {
		super();
		this.salesPrice = salesPrice;
		this.cost = cost;
		this.weight = weight;
	}

	//click on error to autogenerate methods below
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.salesPrice;
	}

	@Override
	public double calcCost() {
		return this.cost*this.weight;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice()-this.calcCost();
	}


}
