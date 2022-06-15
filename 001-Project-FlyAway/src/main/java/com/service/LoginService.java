package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {
		
		LoginDao ld=new LoginDao();
		
		public String checkUser(Login login) {
		
			StringBuffer sb=new StringBuffer(login.getPassword());
			String reversePassword=sb.reverse().toString();
			login.setPassword(reversePassword);	
			
		if(login.getTypeOfUser().equals("Admin")) {
			if(ld.checkAdminLoginDetails(login)) {
				return "adminSuccess";
			}else {
				return "adminFailure";
			}
		}else {
		
		if(ld.checkLoginDetails(login)) {
			return "userSuccess";
		}else {
			return "userFailure";
		}
		}
	}
	
	public String createUser(Login login) {
		StringBuffer sb=new StringBuffer(login.getPassword());
		String reversePassword=sb.reverse().toString();
		login.setPassword(reversePassword);
		
		if(ld.createLoginDetails(login)>0) {
			return "Account created successfully";
		}else{
			return "Account not created";
		}
	
}
	
	
	public String changeAdminPw(Login login) {
		StringBuffer sb=new StringBuffer(login.getPassword());
		String reversePassword=sb.reverse().toString();
		login.setPassword(reversePassword);
			
			if(ld.changeAdminPassword(login)>0) {
				return "Password changed successfully";				
			}else {
			return  "Password not changed. Check Credentials and try again";
		}
	
	}
	
	public String checkAdminUser(Login login) {
		
		StringBuffer sb=new StringBuffer(login.getPassword());
		String reversePassword=sb.reverse().toString();
		login.setPassword(reversePassword);	
		
		if(ld.checkAdminLoginDetails(login)) {
			return "adminSuccess";
		}else {
			return "adminFailure";
		}
}
	}

