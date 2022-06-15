package com.main;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

//run as java application

public class DemoTest {

	public static void main(String[] args) {
		
		//Store Employee records
//		Employee emp1=new Employee(103,"Alvin",15000);
//		EmployeeService es=new EmployeeService();
//		String result=es.storeEmployeeDetails(emp1);
//		System.out.println(result);
		
		//Delete Employee records
//		EmployeeService es=new EmployeeService();
//		String result=es.deleteEmployee(100);
//		System.out.println(result);
//		
		//Update Employee records
//		Employee emp=new Employee();
//		emp.setId(102);
//		emp.setSalary(45000);
//		EmployeeService es=new EmployeeService();
//		String result=es.updateEmployee(emp);
//		System.out.println(result);	

		//find employee records using id
//		EmployeeService es=new EmployeeService();
//		Employee emp=es.findEmployeeById(100);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			
//			System.out.println(emp);
//		}
		
		//Retrieve all records
//		EmployeeService es=new EmployeeService();
//		List<Employee> listOfEmp=es.getAllEmployee();
//		System.out.println("Number of records are"+listOfEmp.size());
//		Iterator<Employee> li=listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp=li.next();
//			System.out.println(emp);
//			
//		}
		
		//Retrieve all records with conditions
//		EmployeeService es=new EmployeeService();
//		List<Employee> listOfEmp=es.getAllEmployeeWithConditions(10000);
//		System.out.println("Number of records are"+listOfEmp.size());
//		Iterator<Employee> li=listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp=li.next();
//			System.out.println(emp);
//			
//		}
		
		//Retrieve more than one property from Employee
		EmployeeService es=new EmployeeService();
		List<Object[]> obj=es.getEmployeeNameAndSalary();
		Iterator<Object[]> li=obj.iterator();
		while(li.hasNext()) {
			Object[]o=li.next();
			System.out.println("Name is "+o[0]+"Salary"+o[1]);
			
		}
		
	}

}
