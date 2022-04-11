package com.example;

public interface SalesCalcs {

	//declare
	public String getName();
	public double calcSalesPrice();
	public double calcCost();
	public double calcProfit();
	
	
	//static method (java 8)
	
	//public static final String reportTitle="\n ==Static List Report==";
	//public static void printArray(SalesCalc[] items){
	//System.out.println(reportTitle);
	//for ( SalesCalcs item: items){
	//System.out.println("--"+item.getName()+ "Report--");
	//System.out.println("Sales Price:"+item.calcSalesPrice());
	//System.out.println("Cost: "+item.calcCost());
	//System.out.println("Profit: "+item.calcProfit());
	//}
	//}
	
	//can also be used to define method in interface
	//add default method (available in java 8)
	//using below dont need to create itemReport Class
	//public default void printItemData() { //dont need to use item
	//	System.out.println("--"+this.getName()+ "Report--");
	//	System.out.println("Sales Price:"+this.calcSalesPrice());
	//	System.out.println("Cost: "+this.calcCost());
	//	System.out.println("Profit: "+this.calcProfit());
		
}
