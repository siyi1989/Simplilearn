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
	
	//if bonus is created as static
	public double calcBonus() {
		return this.getSalary()*GoodBonus.getBonusPercent(this);
	}
	
//replace getter method
	public String getDetails() {
		return "ID: "+empId+"Name: "+name;
	}
	
	//public String getAllDetails() {
	//	return "ID: "+empId+"Name: "+name+"SSN: "+ssn+"Salary: "+salary;
	//}
	
	//for Employeetest1
	@Override
	public String toString() {
		return "ID: "+empId+"Name: "+name+"SSN: "+ssn+"Salary: "+salary;
	}
	
	
//to allow comparison of objects string instead of object hashtag -> refer to EmployeeTest1
//under source>generate hashtag() and equal()
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
	//for bonus computation
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
}


