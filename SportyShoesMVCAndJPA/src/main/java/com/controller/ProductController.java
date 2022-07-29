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
import com.bean.Product;
import com.service.CategoryService;
import com.service.ProductService;

@Controller
public class ProductController {

	
	@Autowired
	ProductService prodService;
	
	@Autowired
	CategoryService catService;

	
	@RequestMapping(value="/StoreNewProducts",method=RequestMethod.POST)
	public ModelAndView InsertProd(HttpServletRequest req,Product prod) {

		ModelAndView mav=new ModelAndView();
		
			prod.setProddesc(req.getParameter("desc"));
			prod.setProdprice(Float.parseFloat(req.getParameter("price")));
			prod.setProdqty(Integer.parseInt(req.getParameter("qty")));
			prod.setProdcatid(Integer.parseInt(req.getParameter("catid")));
			String result=prodService.insertNewProductDetails(prod);
			if(result.equals("Success")) {
				mav.setViewName("StoreNewProducts.jsp");
				mav.addObject("msg","New product added successfully.");
			}else {
				mav.setViewName("StoreNewProducts.jsp");
				mav.addObject("msg",result);
			}
			
			return mav;
		}
	
	
	  @RequestMapping(value = "/ViewProducts", method = RequestMethod.GET)
	    public String ViewProd(ModelMap map, javax.servlet.http.HttpServletRequest req) 
	    {
		  // check if session is still alive
		  HttpSession session = req.getSession();
		  if (session.getAttribute("adminid") == null) {
			  return "/Login";
		  }
		  List<Product> list = prodService.getAllProduct();

		  // use a MAP to link category names to each product in list  
		  HashMap<Integer, String> mapCats = new HashMap<Integer, String>();
		  
		  for(Product product: list) {
			  Category category = catService.getCategoryById(product.getProdcatid());
			  if (category != null)
				  mapCats.put(product.getProdid(), category.getCatname());
		  }
		  map.addAttribute("listOfProd", list);
		  map.addAttribute("mapCats", mapCats);
		  session.setAttribute("listOfProd", list);
		  session.setAttribute("mapCats", mapCats);
		  
	        return "/ViewProducts"; 
	    }

	  
	
		@RequestMapping(value="/ViewProducts/Delete",method=RequestMethod.POST)
		public ModelAndView DeleteProd(HttpServletRequest req) {

			ModelAndView mav=new ModelAndView();
			
				Integer id=Integer.parseInt(req.getParameter("prodid"));
				String result=prodService.deleteProductInfo(id);
					mav.setViewName("ViewProducts.jsp");
					mav.addObject("msg",result);
				return mav;
			}
		
		@RequestMapping(value="/AddToCart",method=RequestMethod.POST)
		public ModelAndView UpdateProd(HttpServletRequest req,Product prod) {

			ModelAndView mav=new ModelAndView();
			
			prod.setProdid(Integer.parseInt(req.getParameter("prodid")));
				Integer qty=Integer.parseInt(req.getParameter("reqty"));
				String result=prodService.UpdateProductInfo(prod,qty);
					mav.setViewName("ViewCart.jsp");
					mav.addObject("msg",result);
				return mav;
			}
		
		
	
		@RequestMapping(value="/ViewProducts/Search",method=RequestMethod.POST)
		public String SearchProd(ModelMap map,HttpServletRequest req,Product prod) {
			
			prod.setProdcatid(Integer.parseInt(req.getParameter("catid")));
			List<Product> list = prodService.getSelectedCatProduct(prod);

			  // use a MAP to link category names to each product in list  
			  HashMap<Integer, String> mapCats = new HashMap<Integer, String>();
			  
			  for(Product product: list) {
				  Category category = catService.getCategoryById(product.getProdcatid());
				  if (category != null)
					  mapCats.put(product.getProdid(), category.getCatname());
			  }
			  map.addAttribute("listOfProd", list);
			  map.addAttribute("mapCats", mapCats);

		        return "/ViewProducts"; 
		    }

	  

	}
	

