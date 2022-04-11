package com.example;

public class TestSales {

	public static void main(String[] args) {
		//both rock 1 and 2 will give same result
		CrushedRock rock1=new CrushedRock(12,10,15); //run from interface
		SalesCalcs rock2=new CrushedRock(12,10,15);//run from class
		
		System.out.println("Sales price: "+rock1.calcSalesPrice());
		System.out.println("Sales price: "+rock2.calcSalesPrice());
		
		SalesCalcs[] itemList=new SalesCalcs[5];
		ItemReport report= new ItemReport();
		
		itemList[0]=new CrushedRock(12.0,10.0,15.0);
		itemList[1]=new CrushedRock(8.0,6.0,10.0);
		itemList[2]=new RedPaint(10.0,8.0,5.0);
		itemList[3]=new Widget(6.0,5.0,10);
		itemList[4]=new Widget(14.0,12.0,20);
		
		System.out.println("==sales report==");
		for (SalesCalcs item:itemList) {
			report.printItemData(item);
			//item.printItemReport(); //calling reportitem from interface instead of ItemReport Class
		}
		
		//to call static method in interface
		//SalesCalcs.printArray(itemList);
	}

}
