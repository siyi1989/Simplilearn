package com.simplilearn.domain;
import com.simplilearn.domain.Employee;

public class EmployeeTest1 {
	public static void main(String[] args) {
		Employee e=new Employee(121, "Ron", "ab123", 4000);
		System.out.println(e);
		
		Employee e1=new Employee(121, "Ron", "ab123", 4000);
		Employee e2=new Employee(121, "Ron", "ab123", 4000);
		
		//comparison of hashtag=false
		System.out.println("e1==e2 " + (e1==e2));
		
		
		//Employee java>under source>generate hashtag() and equal()
		//comparison of objects string =true
		System.out.println("e1.equals(e2) " + (e1.equals(e2)));
		
		
	}
	
	
}
