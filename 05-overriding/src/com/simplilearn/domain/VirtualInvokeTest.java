package com.simplilearn.domain;

public class VirtualInvokeTest {

	public static void main(String[] args) {
		Employee e;//superclass
		
		//variable 'e' is assigned an object of manager(sub class)
		e=new Manager(102,"Joan Kern","444-44-4444",2000,"Marketing");
		
		System.out.println(e.getDetails());//aka late binding -only new manager is called
		
	}

}
