package com.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="checkUser",method=RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req,User user) {
		user.setUsername(req.getParameter("uname"));
		user.setUserpwd(req.getParameter("upassword"));
		String result=userService.checkUserLoginDetails(user);
		ModelAndView mav=new ModelAndView();
		if(result.equals("Success")) {
			mav.setViewName("UserHomePage.jsp");
			req.getSession().setAttribute("ssuser",req.getParameter("uname") );
		}else {
			
			mav.setViewName("Login.jsp");
			mav.addObject("msg", result);
			return mav;
		}
		return mav;
		
	}

	@RequestMapping(value="/SignUp",method=RequestMethod.GET)
	public ModelAndView storeUser() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("SignUp.jsp");
		return mav;
		
	}
	
	@RequestMapping(value="createNewUser",method=RequestMethod.POST)
	public ModelAndView SignUp(HttpServletRequest req,User user) {
		
		user.setUsername(req.getParameter("uname"));
		
		String result1=userService.checkUserName(user);
		ModelAndView mav=new ModelAndView();
		
		if (result1.equals("Success")){
			user.setUserpwd(req.getParameter("upassword"));
			user.setUfirstname(req.getParameter("ufname"));
			user.setUlastname(req.getParameter("ulname"));
			user.setUaddress(req.getParameter("uadd"));
			user.setUemail(req.getParameter("umail"));
			user.setUdate(Calendar.getInstance().getTime());
			String result=userService.insertNewUserDetails(user);
			if(result.equals("Success")) {
				mav.setViewName("UserHomePage.jsp");
				mav.addObject("msg","New User account created successfully.");
				req.getSession().setAttribute("ssuser",req.getParameter("uname") );
			}else {
				mav.setViewName("SignUp.jsp");
				mav.addObject("msg",result);
			}

		}else {
			mav.setViewName("SignUp.jsp");
			mav.addObject("msg",result1);
		}
		return mav;
		}
	
	
	@RequestMapping(value="/ViewUsers", method=RequestMethod.GET)
	public String ViewUsers(HttpServletRequest req) {
		List<User> listOfUser=userService.getAllUsers();
		req.setAttribute("listOfUser", listOfUser);
		return "listOfUser";
		
	}

	@RequestMapping(value="/ViewUsers/ByUserName", method=RequestMethod.POST)
	public String ViewUsersByUserName(HttpServletRequest req,User user) {
		String selUname=req.getParameter("seluname");
		
		if(selUname.isEmpty()) {
			List<User> listOfUser=userService.getAllUsers();
			req.setAttribute("listOfUser", listOfUser);
		}else {
			user.setUsername(req.getParameter("uname"));
			List<User> listOfUser=userService.getFromUserName(user);
			req.setAttribute("listOfUser", listOfUser);
			
			if(listOfUser.size()==0) {
				listOfUser=userService.getAllUsers();
				req.setAttribute("listOfUser", listOfUser);
				req.setAttribute("msg", "No selection matching username");
			}
			return "listOfUser";
		}
		return "listOfUser";
	}
		
	
	@RequestMapping(value="/ViewUsers/ByDate", method=RequestMethod.POST)
	public String ViewUsersByUserDate(HttpServletRequest req,User user,@RequestParam(value="startdate")     @DateTimeFormat(pattern="MMddyyyy") Date startdate,
			@RequestParam(value="enddate")     @DateTimeFormat(pattern="MMddyyyy") Date enddate) {

			List<User> listOfUser=userService.getFromUserDate(startdate,enddate);
			req.setAttribute("listOfUser", listOfUser);
			if(listOfUser.size()==0) {
				listOfUser=userService.getAllUsers();
				req.setAttribute("listOfUser", listOfUser);
				req.setAttribute("msg", "No selection matching date range");
			
			}
			
			return "listOfUser";
		}
		

	}
	

