package com.simplilearn;

public class Strings {

	public static void main(String[] args) {
		char letter ='a';
		
		String string1="Hello";
		String string2="Hello";
		
		String string3="";
		
		String DontDoThis1=new String("Bad Practice");//create a new string which takes up memory
		String DontDoThis2=new String("Bad Practice");//create a new string which takes up memory
		
		
		string3=string1+string2;//concatenate strings
		System.out.println("Output: "+string3 +" "+letter);
	}

}
