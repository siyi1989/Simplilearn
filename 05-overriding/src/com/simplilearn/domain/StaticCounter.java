package com.simplilearn.domain;

public class StaticCounter {

	private static int counter=0;
	public static int getCount() {
		return counter;
		
	}
	
	public static void increment() {
		counter++;
		
	}
}
