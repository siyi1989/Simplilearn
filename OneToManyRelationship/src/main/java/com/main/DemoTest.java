package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Students;
import com.bean.Trainer;

public class DemoTest {

	public static void main(String[] args) {
		
	       Configuration con  = new Configuration();
	        con.configure("hibernate.cfg.xml");
	        SessionFactory sf = con.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tran = session.getTransaction();
	        
	        Trainer t1 = new Trainer();
	        t1.setTid(2);
	        t1.setTname("Emily");
	        t1.setTech("Java");
	        
	        Students s1 = new Students();
	        s1.setSid(102);
	        s1.setSname("Raj");
	        s1.setAge(21);
	        s1.setTsid(1);
	        
	        Students s2 = new Students();
	        s2.setSid(103);
	        s2.setSname("abdul");
	        s2.setAge(22);
	        s2.setTsid(1);
	        
	        List<Students>listOfStd=new ArrayList<Students>();
	        listOfStd.add(s1);
	        listOfStd.add(s2);
	        
	        t1.setListOfStd(listOfStd);
	        
	        tran.begin();
	        session.save(t1);
	        //session.save(s1);
	        //session.save(s2);
	        tran.commit();
	        System.out.println("Record stored successfully");
	}

}
