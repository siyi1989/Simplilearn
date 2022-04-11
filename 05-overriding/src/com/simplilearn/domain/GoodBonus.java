package com.simplilearn.domain;

public class GoodBonus {

	//polymorphic argument
	public static double getBonusPercent(Employee e) {
		if (e instanceof Employee) {
			return e.getSalary()*0.01;
		}else if (e instanceof Engineer) {
			return e.getSalary()*0.02;
		}else if (e instanceof Manager) {
			return e.getSalary()*0.02;	
	}else if (e instanceof Director) {
		return e.getSalary()*0.05;
}else {
	return 0;
}
	}
}


	