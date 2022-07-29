package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.Admin;

@Repository
@Component
public class AdminDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int checkAdmin(Admin admin) {
		try{
			EntityManager manager=emf.createEntityManager();
		
		List<Admin>listOfAdmin=manager.createQuery("select a from Admin a where a.adminname=:auser and a.adminpwd=:apwd")
				.setParameter("auser", admin.getAdminname())
				.setParameter("apwd",admin.getAdminpwd())
				.getResultList();
			return listOfAdmin.size();
		}catch(Exception e) {
			System.out.println(e);
			return 0;
			
		}
	}
	
	public int changeAdminPw(Admin admin,String newpw) {
			EntityManager manager=emf.createEntityManager();
			EntityTransaction tran=manager.getTransaction();
			Admin admin1=manager.createQuery("select a from Admin a where a.adminname=:adminname and a.adminpwd=:adminpwd",Admin.class)
					.setParameter("adminname",admin.getAdminname())
					.setParameter("adminpwd",admin.getAdminpwd())
					.getSingleResult();
			if(admin1!=null) {
				tran.begin();
				admin1.setAdminpwd(newpw);
				manager.merge(admin1);
				tran.commit();
				return 1;
			}else {
				return 0;
			}

	}
}

