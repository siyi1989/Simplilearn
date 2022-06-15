package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed=new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "salary must be > 12000";
			
					
		}else if (ed.storeEmployee(emp)>0) {
			return "record stored successfully";
		}else {
			return "record not stored";
			
		}
	}
	
	 public List<Employee> getAllEmployeeDetails(){
		 List<Employee> listOfEmp=ed.getAllEmployee();
		 Iterator<Employee>li=listOfEmp.iterator();
		 while(li.hasNext()) {
			 Employee emp=li.next();
			 float hra=emp.getSalary()*0.10f;
			 float da=emp.getSalary()*0.05f;
			 float pf=emp.getSalary()*0.07f;
			 float grossSalary=emp.getSalary()+hra+da-pf;
			 emp.setSalary(grossSalary);
		 }
		 return listOfEmp;
		 
	 }
}
