package com.example.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,String> partList=new TreeMap<>();
		partList.put("s1", "Blue Polo Shirt");
		partList.put("s2", "Black Polo Shirt");
		partList.put("h2", "Duke Hat");
		
		partList.put("s2", "Black T-Shirt");//overwrite value
		Set<String> keys =partList.keySet();
		
		System.out.println("===Part List===");
		for (String key:keys) {
			System.out.println("Part# "+key);
			System.out.println("Value: "+partList.get(key));
			
		}
		

	}

}
