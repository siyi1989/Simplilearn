package com.simplilearn.client;

import com.simplilearn.client.Box;

public class BoxTest {

	public static void main(String[] args) {
		//test overloaded constructors
		double vol;
		Box mybox1=new Box();
		Box mybox2= new Box (5.5);
		Box mybox3=new Box (2.3,4.5,6.6);
		
		vol=mybox1.volume();
		System.out.println("vol of mybox1="+vol);
		
		vol=mybox2.volume();
		System.out.println("vol of mybox2="+vol);
		
		vol=mybox3.volume();
		System.out.println("vol of mybox3="+vol);
		
		//test implicit casting
		//byte->short->int->long->float->double
		//char->int->long->float->double (char cannot promote to short.char(+ive only) & short(+/-ive))
		char c= 'A';
		int i=c;
		System.out.println(i);
		
		
		//test explicit casting
		
		double d=2.23;
		float f=(float)d;
		System.out.println(f);
	
	}

}