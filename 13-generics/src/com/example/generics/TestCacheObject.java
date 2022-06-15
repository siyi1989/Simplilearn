package com.example.generics;

public class TestCacheObject {

	public static void main(String[] args) {
		
		CacheString myMessage=new CacheString();//Type specific
		CacheShirt myShirt=new CacheShirt();//Type specific
		
		myMessage.add("save this for me");//Type specific
		
		System.out.println("Message is :" +myMessage.get());
		
		myShirt.add(Shirt.newShirt(1, "blue shirt", "blue", "Large"));//Type specific

		System.out.println("Shirt Type :" +myShirt.get().toString());
	}

}
