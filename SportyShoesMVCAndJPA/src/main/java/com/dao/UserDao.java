package com.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.bean.User;

@Repository
@Component
public class UserDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int checkUser(User user) {
		try{
			EntityManager manager=emf.createEntityManager();
		
		List<User>listOfUser=manager.createQuery("select u from User u where u.username=:uuser and u.userpwd=:upwd")
				.setParameter("uuser", user.getUsername())
				.setParameter("upwd",user.getUserpwd())
				.getResultList();
			return listOfUser.size();
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
	}
	
	public int validateUserName(User user) {
		try{
			EntityManager manager=emf.createEntityManager();
		
		List<User>listOfUser=manager.createQuery("select u from User u where u.username=:uuser")
				.setParameter("uuser", user.getUsername())
				.getResultList();
			return listOfUser.size();
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
	}
	public int insertNewUser(User user) {
		try{
			EntityManager manager=emf.createEntityManager();
			EntityTransaction tran=manager.getTransaction();//same as trans in hibernate
			tran.begin();
			manager.persist(user);
			tran.commit(); 
			return 1;
			
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
		
	}
	
	public List<User> getAllUsers(){
		EntityManager manager=emf.createEntityManager();
		Query qry=manager.createQuery("select u from User u"); //Java persistence query language
		List<User> listOfUser=qry.getResultList();
		return listOfUser;
	}
	
	public List<User> getSelectedUserName(User user) {

				EntityManager manager=emf.createEntityManager();
				List<User>listOfUser=manager.createQuery("select u from User u where u.username=:uuser")
				.setParameter("uuser", user.getUsername())
				.getResultList();
				return listOfUser;
	
	}
	
	public List<User> getSelectedUserDate(Date startdate,Date enddate) {

		EntityManager manager=emf.createEntityManager();
	
		List<User>listOfUser=manager.createQuery("select u from User u where u.udate>=:startdate and u.udate<=:enddate")
			.setParameter("startdate", startdate)
			.setParameter("enddate", enddate)
			.getResultList();
		return listOfUser;
	

	}
}
