package com.simplilearn.domain;
public class Manager extends Employee{
	//field specific to manager (not in employee)
	private String deptName;
	//define constructor specific to manager class
	public Manager(int empId, String name,String ssn,double salary,String deptName) {
		super(empId,name,ssn,salary);
		this.deptName=deptName;
		
		
	}
}
