package com.simplilearn.domain;

public class A04StaticInitializerTest {

	private static final boolean [] switches=new boolean [5] ;
	
	//static initializer
	static {
		System.out.println("Initializing...");
		for (int i =0; i<5; i++) {
			switches[i]=true;
			
		}
		}
	//this constructor is ignored because of the static above
	public A04StaticInitializerTest() {
		System.out.println("Constructor");
	}
	public static void main (String[] args) {
		switches[1]=false;
		switches[2]=false;
		System.out.println("Switch settings:");
		for (boolean curSwitch:switches) {
			if (curSwitch) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
		System.out.println();
	}
}


