package com.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.Purchase;

@Repository
@Component
public class PurchaseDao {

	@Autowired
	EntityManagerFactory emf;
	
	
	public int insertNewPurchase(Purchase pur) {
		try{
			EntityManager manager=emf.createEntityManager();
			EntityTransaction tran=manager.getTransaction();//same as trans in hibernate
			tran.begin();
			manager.persist(pur);
			tran.commit(); 
			return 1;
			
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
		
	}
	
	public List<Purchase> getAllPurchase(){
		EntityManager manager=emf.createEntityManager();
		Query qry=manager.createQuery("select pur from Purchase pur"); //Java persistence query language
		List<Purchase> listOfPurchase=qry.getResultList();
		return listOfPurchase;
	}
	
	
	
	public List<Purchase> getSelIdPurchase(Purchase pur) {

				EntityManager manager=emf.createEntityManager();
				List<Purchase>listOfPurchase=manager.createQuery("select pur from Purchase pur where pur.puruserid=:puruserid")
				.setParameter("puruserid", pur.getPuruserid())
				.getResultList();
				return listOfPurchase;
	
	}
	
	public List<Purchase> getSelDatePurchase(Purchase pur,Date startdate,Date enddate) {

		EntityManager manager=emf.createEntityManager();
		List<Purchase>listOfPurchase=manager.createQuery("select pur from Purchase pur where pur.purdate>=:startdate and pur.purdate<=:enddate")
				.setParameter("startdate", startdate)
				.setParameter("enddate", enddate)
		.getResultList();
		return listOfPurchase;

}
	
	public int deletePurInfo(int id) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Purchase pur=manager.find(Purchase.class,id);
		if(pur!=null) {
			tran.begin();
			manager.remove(pur);
			tran.commit();
			return 1;
		}else {
			return 0;
			
		}
	}
	
	public int confirmPur(Purchase pur) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Purchase pur1=manager.find(Purchase.class,pur.getCart());
		if(pur1!=null) {
			tran.begin();
			pur.setCart(pur.getCart());
			manager.merge(pur1); //same as session.update(emp1)
			tran.commit();
			return 1;
		}else {
			return 0;
	}
}
}
