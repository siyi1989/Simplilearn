package com.simplilearn.client;

public class Overloading {

	public void print (int i) {
		System.out.println(i);
	}	
		public void print (float f) {
			System.out.println(f);		
	}
	public void print (String s) {
		System.out.println(s);
}
	
	public static void main (String[] args) {
		Overloading ov= new Overloading ();
		ov.print("hello");
		//ov.print(2.2); default 2.2 is double so error
		ov.print(2.2F);
	}
}
