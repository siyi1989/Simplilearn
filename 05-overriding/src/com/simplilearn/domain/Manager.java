package com.simplilearn.domain;
public class Manager extends Employee{
	//field specific to manager (not in employee)
	private String deptName;
	
	public void setDeptName(String deptName) {
		// TODO Auto-generated method stub
		this.deptName=deptName;
	}
	
	//define constructor specific to manager class
	public Manager(int empId, String name,String ssn,double salary,String deptName) {
		super(empId,name,ssn,salary);
		this.deptName=deptName;
	}
	//override method of Employee- so that deptName is included
	//override accessibility cannot be less than superclass. public>protected>default>private
	@Override
	public String getDetails() {
		return super.getDetails()+"Dept: "+deptName;
			
		}

	
}
