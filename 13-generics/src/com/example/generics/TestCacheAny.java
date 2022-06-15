package com.example.generics;

public class TestCacheAny {

	public static void main(String[] args) {
				
		//Generics
		CacheAny<String>myGenericMessage=new CacheAny<String>();
		CacheAny<Shirt>myGenericShirt=new CacheAny<Shirt>();
		
		myGenericMessage.add("save this for me");
		
		System.out.println("Message is :" +myGenericMessage.get());
		
		myGenericShirt.add(Shirt.newShirt(1, "red shirt", "red", "Large"));

		System.out.println("Shirt Type :" +myGenericShirt.get().toString());
	}

}
