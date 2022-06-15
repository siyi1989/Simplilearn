package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Employee;

public class EmployeeDao {

	public int storeEmployeeDetails(Employee emp) {
		try {
			Configuration con=new Configuration();
			con.configure("hibernate.cfg.xml"); //load database details
			SessionFactory sf=con.buildSessionFactory();//connection in jdbc
			Session session=sf.openSession(); //statemnt and preparedstmt
			Transaction tran=session.getTransaction(); //only required if modifying data, not required for query
			tran.begin();
			session.save(emp);
			tran.commit();
			return 1;
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int deleteEmployeeDetails(int id) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		Transaction tran=session.getTransaction();
		Employee emp = session.get(Employee.class, id);
		
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			session.delete(emp);
			tran.commit();
			return 1;
		}
	}
	
	public int updateEmployeeDetails(Employee e) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		Transaction tran=session.getTransaction();
		Employee emp = session.get(Employee.class, e.getId());
		
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
			emp.setSalary(e.getSalary());
			session.update(emp);
			tran.commit();
			return 1;
		}
	}
	
	public Employee findEmployeeById(int id) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		Employee emp = session.get(Employee.class,id);
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		Query qry=session.createQuery("select emp from Employee emp"); //HQL Hibernate query lang
		List<Employee> listOfEmp=qry.list();
		return listOfEmp;
	}
	
	public List<Employee> getAllEmployeeWithConditions(float salary) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		//Static condition
		//Query qry=session.createQuery("select emp from Employee emp where emp.salary>30000"); //HQL Hibernate query lang
		//Dynamic condition
//		Query qry=session.createQuery("select emp from Employee emp where emp.salary>:salary");
//		qry.setParameter("salary", salary);
		
		//Dynamic condition with placeholder
		Query qry=session.createQuery("select emp from Employee emp where emp.salary>?1");
		qry.setParameter(1, salary);
		
		List<Employee> listOfEmp=qry.list();
		return listOfEmp;
	}
	
	public List<String>retrieveOnlyNames() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		
		//Dynamic condition with placeholder
		Query qry=session.createQuery("select emp.name from Employee emp");
		
		List<String> listOfEmp=qry.list();
		return listOfEmp;
	}
	
	public List<Object[]>retrieveNameAndSalary() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		
		//Dynamic condition with placeholder
		Query qry=session.createQuery("select emp.name,emp.salary from Employee emp");
		
		List<Object[]> listOfEmp=qry.list();
		return listOfEmp;
	}
	
	public List<Object[]>retrieveDataUsingSql() {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml"); //load database details
		SessionFactory sf=con.buildSessionFactory();//connection in jdbc
		Session session=sf.openSession(); //statemnt and preparedstmt
		
		//Dynamic condition with placeholder
		Query qry=session.createNativeQuery("select * from employee");
		List<Object[]> listOfEmp=qry.list();
		return listOfEmp;
	}
}
