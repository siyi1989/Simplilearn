package com.example.generics;

public class CacheAny<T> {//Type 

	private T t;
	
	public void add (T t) {
		this.t=t;
		
	}

	public T get() {
		return this.t;
	}
	
		
}
