package com.simplilearn.domain;

public class BadBonus {

//each subclass will need to create a return statement which is not ideal	
	public double calcBonus (Employee e) {
		return e.getSalary()*0.01;
		
	}
	
	public double calcBonus (Manager m) {
		return m.getSalary()*0.03;
		
	}
	
	public double calcBonus (Engineer eng) {
		return eng.getSalary()*0.02;
		
	}
	
	public double calcBonus (Director d) {
		return d.getSalary()*0.02;
		
	}
	
}
