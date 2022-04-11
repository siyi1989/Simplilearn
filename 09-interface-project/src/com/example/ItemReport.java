package com.example;

public class ItemReport {
 
	public void printItemData(SalesCalcs item) { //can use interface item
		System.out.println("--"+item.getName()+ "Report--");
		System.out.println("Sales Price:"+item.calcSalesPrice());
		System.out.println("Cost: "+item.calcCost());
		System.out.println("Profit: "+item.calcProfit());
		
	}
}
