package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

	public static void main (String[] args) {
		List<Integer> partList=new ArrayList<Integer>(2);
		
		partList.add(1);
		partList.add(2);
		partList.add(3); //ArrayList auto grow
		
		System.out.println("First Part: "+partList.get(0));
		
		partList.add(0,4);//insert an item by index
		partList.add(1,5);
		
		for (Integer partNumberObj: partList) {
			int partNumber=partNumberObj;//autoboxing
			System.out.println("Part Number: "+partNumber);
			
		}
		
		
	}
}
