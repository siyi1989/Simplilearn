package com.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.dao.UserDao;


@Service
@Component
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Transactional
	public String checkUserLoginDetails(User user) {
		if (userDao.checkUser(user)>0){
			return "Success";
		}else {
			return "Login failed. Please try again";
						
		}
		
	}
	
	@Transactional
	public String checkUserName(User user) {
		if (userDao.validateUserName(user)>0){
			return "This username is in use. Please enter another.";
		}else {
			return "Success";
						
		}
		
	}
	
	@Transactional
	public String insertNewUserDetails(User user) {
		if(userDao.insertNewUser(user)>0) {
			return "Success";
		}else {
			return "User account creation failed. Please try again";
						
		}
}
	
	@Transactional
	public List<User>getAllUsers() {
		return userDao.getAllUsers();
}
	
	@Transactional
	public List<User>getFromUserName(User user) {
		return userDao.getSelectedUserName(user);
}
	
	@Transactional
	public List<User>getFromUserDate(Date startdate,Date enddate) {
		return userDao.getSelectedUserDate(startdate,enddate);
}
	
}

