package com.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.bean")
public class DemoTest {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Server running on port number 8080");
		
		UserService userService=new UserService();
		List<User> listOfUser=userService.getAllUsers();
		Integer sizeOfList=listOfUser.size();
		
		System.out.println(sizeOfList);
	}

}
