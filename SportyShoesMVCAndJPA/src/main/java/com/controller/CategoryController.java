package com.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Category;
import com.service.CategoryService;

@Controller
public class CategoryController {

	
	@Autowired
	CategoryService catService;

	
	@RequestMapping(value="/StoreNewCategory",method=RequestMethod.POST)
	public ModelAndView StoreNewCategory(HttpServletRequest req,Category cat) {

		ModelAndView mav=new ModelAndView();
		
			cat.setCatname(req.getParameter("catdesc"));
			String result=catService.insertNewCatDetails(cat);
				mav.setViewName("StoreNewCategory.jsp");
				mav.addObject("msg",result);	
			return mav;
		}
	
	
	  @RequestMapping(value = "/ViewCategory", method = RequestMethod.GET)
	    public String ViewCat(javax.servlet.http.HttpServletRequest req) {

		  List<Category> listOfCat = catService.getAllCategory();
			req.setAttribute("listOfCat", listOfCat);
			return "listOfCat";
			
	    }

	
		@RequestMapping(value="/DeleteCategory",method=RequestMethod.POST)
		public ModelAndView DeleteCategory(HttpServletRequest req) {

			ModelAndView mav=new ModelAndView();
			
				Integer id=Integer.parseInt(req.getParameter("catid"));
				String result=catService.deleteCategoryInfo(id);
					mav.setViewName("ViewCategory.jsp");
					mav.addObject("msg",result);
				return mav;
			}
		
	
	  

	}
	

