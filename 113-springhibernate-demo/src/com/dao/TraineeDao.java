package com.dao;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.to.Trainee;

public class TraineeDao {

	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate(HibernateTemplate hibernateTemplate) {
		return this.hibernateTemplate;
		
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
		
	}
	public int addTrainee(Trainee t) {
		Session session=hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		
		int id=(int)session.save(t);
		session.getTransaction().commit();
		return id;
	}
	
	public List<Trainee> getAllTrainees(){
		List<Trainee> traineeList=new ArrayList<Trainee>();
		traineeList=hibernateTemplate.loadAll(Trainee.class);
		return traineeList;
		
	} 
}
