package demo;

import test.Foo;

public class Bar extends Foo {
	private int sum=10;
	public void reportSum() {
		sum+=result;
		//sum+=value; compile error -value not visible as it is under default
	}
}
