package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class MyController {

	@RequestMapping("/")
	public String showHome() {
		System.out.println("home");
		return "home";
		
	}
	
	@RequestMapping(value="sayName",method=RequestMethod.POST)
	public String readName(@RequestParam("fname")String firstname,ModelMap map) {
		map.addAttribute("firstname",firstname);
		return "profile"; //append.jsp and takes to profile.jsp page
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String isValidUser(@RequestParam("username")String username,
			@RequestParam("password")String password,ModelMap map) {
		String page="home";
		if(username.equalsIgnoreCase("tom") && password.equals("jerry")) {
			map.addAttribute("firstname",username);
			page="profile";
			}else {
				map.addAttribute("errorMessage","Invalid login credentials");
				
			}
		return page;
		}
		
}
