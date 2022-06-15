package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.to.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO dao=(EmployeeDAO)ap.getBean("edao");
		
		/*
		 * Employee e1=new Employee(); e1.setEid(104); e1.setEname("r"); e1.setAge(50);
		 * e1.setPassword("yy");
		 * 
		 * int count=dao.addEmployee(e1); System.out.println(count+"records added");
		 */
		/*
		 * List<Employee> list=dao.getAllEmployees(); for (Employee employee:list){
		 * System.out.println(employee);
		 * 
		 * }
		 */
		
		Employee e1=new Employee();
		e1.setEid(115);
		e1.setEname("hahatest");
		e1.setAge(120);
		e1.setPassword("1232435");
		dao.PerformMultiActions(e1);
		
	}

}
