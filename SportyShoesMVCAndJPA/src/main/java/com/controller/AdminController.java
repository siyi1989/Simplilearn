package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Admin;
import com.service.AdminService;

@Controller
public class AdminController {

	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="checkAdmin",method=RequestMethod.POST)
	public ModelAndView checkAdminDetails(HttpServletRequest req,Admin adm) {
		adm.setAdminname(req.getParameter("aname"));
		adm.setAdminpwd(req.getParameter("apassword"));
		String result=adminService.checkAdminLoginDetails(adm);
		ModelAndView mav=new ModelAndView();
		if(result.equals("Success")) {
			HttpSession session = req.getSession();
			session.setAttribute("Adminid", req.getParameter("aname"));
			mav.setViewName("AdminHomePage.jsp");
		}else {
			
			mav.setViewName("Login.jsp");
			mav.addObject("msg", result);
		}
		return mav;
		
	}

	@RequestMapping(value="changeAdmin",method=RequestMethod.POST)
	public ModelAndView changeAdminPw(HttpServletRequest req,Admin adm,String newpw) {
		adm.setAdminname(req.getParameter("aname"));
		adm.setAdminpwd(req.getParameter("apassword"));
		newpw=req.getParameter("anewpassword");
		
		String result=adminService.checkAdminLoginDetails(adm);
		ModelAndView mav=new ModelAndView();
		if(result.equals("Success")) {
			String result1=adminService.updateAdminPwd(adm,newpw);
			if(result1.equals("Success")) {
				mav.setViewName("AdminHomePage.jsp");
				mav.addObject("msg","Admin password updated successfully");
				
			}else {
				mav.setViewName("UpdateAdminPw.jsp");
				mav.addObject("msg","Admin password not updated. Please try again.");
			}
		}else {
			mav.setViewName("UpdateAdminPw.jsp");
			mav.addObject("msg", "Check admin username and old password. Does not match with records.");
		}
		return mav;
		
	}
	
	
	

}
