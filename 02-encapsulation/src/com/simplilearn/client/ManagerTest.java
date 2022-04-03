package com.simplilearn.client;

import com.simplilearn.domain.Manager;

public class ManagerTest {

	
	
	public static void main(String[] args) {
		Manager mgr = new Manager(102,"Barbara Jones","107-99-9078",100000,"Marketing");
		System.out.println("Name :"+mgr.getName());
		System.out.println("Name :"+mgr.getSsn());
		System.out.println("Before salary change :"+mgr.getSalary());
		mgr.raiseSalary(2000);
		System.out.println("After salary change :"+mgr.getSalary());
	}

}
