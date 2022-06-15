package com.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.SomeBO;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		SomeBO bo=(SomeBO) ap.getBean("bo");
		bo.Validate();
		try {
			bo.Validate(19);
			
		}catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
