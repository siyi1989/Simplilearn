package com.simplilearn.domain;

public class Employee {

	//Fields (Instance variables)
	//change from public to private to disallow illogical changes eg. negative salary
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	//Parameterized Constructor 
	public Employee( int empId,String name,String ssn,double salary) {
// empId=empId; problem ambiguity (field name is same as variable name)
		if (salary>1000) {
		this.empId=empId;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
} else {
	System.out.println("Salary should be greater than $1,000");
}
	}
	//method
	public void changeName(String newName) {
	if(newName!=null) {
		this.name=newName;
		
	}
}
	public void raiseSalary(double increase) {
		this.salary +=increase;
	}
	
	//generate automatically under source> generate setter/getter
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
}

