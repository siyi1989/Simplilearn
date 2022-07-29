package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Admin;
import com.dao.AdminDao;


@Service
@Component
public class AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	@Transactional
	public String checkAdminLoginDetails(Admin adm) {
		if (adminDao.checkAdmin(adm)>0){
			return "Success";
		}else {
			return "Login failed. Please try again";
						
		}
		
	}
	
	@Transactional
	public String updateAdminPwd(Admin adm,String newpw) {
		if(adminDao.changeAdminPw(adm,newpw)==1) {
			return "Success";
		}else {
			return "Password not updated. Please try again";
						
		}
}
}

