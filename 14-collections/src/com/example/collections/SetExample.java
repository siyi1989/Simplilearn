package com.example.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		
		Set<String> set=new TreeSet<String>();
		
		//string auto sorted in alphabetical order for set
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("three"); //not added. duplicate not supported in set
		
		for(String item:set) {
			System.out.println("Item: "+item);
		}

	}

}
