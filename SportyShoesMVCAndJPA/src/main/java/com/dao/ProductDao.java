package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
@Component
public class ProductDao {

	@Autowired
	EntityManagerFactory emf;
	
	
	public int insertNewProduct(Product product) {
		try{
			EntityManager manager=emf.createEntityManager();
			EntityTransaction tran=manager.getTransaction();//same as trans in hibernate
			tran.begin();
			manager.persist(product);
			tran.commit(); 
			return 1;
			
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
		
	}
	
	public List<Product> getAllProduct(){
		EntityManager manager=emf.createEntityManager();
		Query qry=manager.createQuery("select p from Product p"); //Java persistence query language
		List<Product> listOfProduct=qry.getResultList();
		return listOfProduct;
	}
	
	
	
	public List<Product> getSelCatProduct(Product prod) {

				EntityManager manager=emf.createEntityManager();
				List<Product>listOfProduct=manager.createQuery("select p from Product p where p.prodcatid=:pcatid")
				.setParameter("pcatid", prod.getProdcatid())
				.getResultList();
				return listOfProduct;
	
	}
	
	public List<Product> getSelProduct(Product prod) {

		EntityManager manager=emf.createEntityManager();
		List<Product>listOfProduct=manager.createQuery("select p from Product p where p.prodid=:pid")
		.setParameter("pid", prod.getProdid())
		.getResultList();
		return listOfProduct;

}
	
	public int deleteProdInfo(int id) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Product prod=manager.find(Product.class,id);
		if(prod!=null) {
			tran.begin();
			manager.remove(prod);
			tran.commit();
			return 1;
		}else {
			return 0;
			
		}
	}
	
	public int updateQty(Product prod) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Product prod1=manager.find(Product.class,prod.getProdqty());
		if(prod1!=null) {
			tran.begin();
			prod.setProdqty(prod.getProdqty());
			manager.merge(prod1); //same as session.update(emp1)
			tran.commit();
			return 1;
		}else {
			return 0;
	}
}
	
	public Integer findProductQty(int id) {
		EntityManager manager=emf.createEntityManager();
		Product prod=manager.find(Product.class, id);
		if(prod!=null) {
			return prod.getProdqty();
		}else {
			return 0;
			
		}
	}
}
