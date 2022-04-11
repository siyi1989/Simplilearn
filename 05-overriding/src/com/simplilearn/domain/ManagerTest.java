package com.simplilearn.domain;

public class ManagerTest {
	public static void main( String [] args){
		Manager mgr=new Manager(151,"Tom","444-44-4444",8000,"admin");
		
		System.out.println("Manager: "+mgr.getDetails());
		
		Employee e=new Employee(101,"Jim Smith","0111-022-3344",4000);
		System.out.println("Employee: "+e.getDetails());
	}
}
