package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.Category;

@Repository
@Component
public class CategoryDao {

	@Autowired
	EntityManagerFactory emf;
	
	
	public int insertNewCategory(Category category) {
		try{
			EntityManager manager=emf.createEntityManager();
			EntityTransaction tran=manager.getTransaction();//same as trans in hibernate
			tran.begin();
			manager.persist(category);
			tran.commit(); 
			return 1;
			
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
		
	}
	
	
	public List<Category> getAllCategory(){
		EntityManager manager=emf.createEntityManager();
		Query qry=manager.createQuery("select cat from Category cat"); //Java persistence query language
		List<Category> listOfCategory=qry.getResultList();
		return listOfCategory;
	}
	
	public int deleteCatInfo(int id) {
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Category cat=manager.find(Category.class,id);
		if(cat!=null) {
			tran.begin();
			manager.remove(cat);
			tran.commit();
			return 1;
		}else {
			return 0;
			
		}
	}
	
	public Category getCategoryById(long id) {
		EntityManager manager=emf.createEntityManager();
		String strId = String.valueOf(id);
		Query qry=manager.createQuery("select cat from Category cat where cat.id=:strId");
		List<Category> listOfCategory=qry.getResultList();
		if (listOfCategory.size() > 0)
			return (Category) listOfCategory.get(0);
		else
			return null;
		
	}
}
