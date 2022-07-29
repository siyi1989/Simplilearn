package com.controller;

import java.math.BigDecimal;
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


import com.bean.Purchase;
import com.bean.User;
import com.service.PurchaseService;

@Controller
public class PurchaseController {

	
	@Autowired
	PurchaseService purchaseService;


	
	@RequestMapping(value="/ViewCart",method=RequestMethod.POST)
	public ModelAndView InsertPurchase(HttpServletRequest req,Purchase pur) {

		ModelAndView mav=new ModelAndView();
		
			pur.setPurdate((Calendar.getInstance().getTime()));
			pur.setPurprodid(Integer.parseInt(req.getParameter("prodid")));
			pur.setPurprice(Float.parseFloat(req.getParameter("price")));
			pur.setPurqty(Integer.parseInt(req.getParameter("qty")));
			pur.setPuruserid(Integer.parseInt(req.getParameter("ssuserid")));
			pur.setPurtotal((Math.multiplyExact(Long.parseLong(req.getParameter("qty")), Long.parseLong(req.getParameter("price")))));
			pur.setCart("Pending");
			String result=purchaseService.insertNewPurchaseDetails(pur);
			if(result.equals("Success")) {
				mav.setViewName("ViewCart.jsp");
				mav.addObject("msg","Cart confirmed successfully.");
			}else {
				mav.setViewName("ViewCart.jsp");
				mav.addObject("msg",result);
			}
			
			return mav;
		}
	

	  
	
		@RequestMapping(value="/ViewCart/Delete",method=RequestMethod.POST)
		public ModelAndView DeletePurchase(HttpServletRequest req) {

			ModelAndView mav=new ModelAndView();
			
				Integer id=Integer.parseInt(req.getParameter("prodid"));
				String result=purchaseService.deletePurchaseInfo(id);
					mav.setViewName("ViewCart.jsp");
					mav.addObject("msg",result);
				return mav;
			}

	
	
		@RequestMapping(value="/ViewPurchases", method=RequestMethod.GET)
		public String ViewPurchases(HttpServletRequest req) {
			List<Purchase> listOfPurchase=purchaseService.getAllPurchase();
			req.setAttribute("listOfPurchase", listOfPurchase);
			return "listOfPurchase";
			
		}
		
		@RequestMapping(value="/ViewPurchases/ByDate", method=RequestMethod.POST)
		public String ViewPurchasesByDate(HttpServletRequest req,Purchase pur,@RequestParam(value="startdate")     @DateTimeFormat(pattern="MMddyyyy") Date startdate,
				@RequestParam(value="enddate")     @DateTimeFormat(pattern="MMddyyyy") Date enddate) {

			List<Purchase> listOfPurchase=purchaseService.getSelectedDatePurchase(pur,startdate,enddate);
			req.setAttribute("listOfPurchase", listOfPurchase);
				if(listOfPurchase.size()==0) {
					listOfPurchase=purchaseService.getAllPurchase();
					req.setAttribute("listOfPurchase", listOfPurchase);
					req.setAttribute("msg", "No selection matching date range");
				
				}
				
				return "listOfPurchases";
			}
	
		
		@RequestMapping(value="/ViewPurchases/ByUserId", method=RequestMethod.POST)
		public String ViewPurchasesByUserId(HttpServletRequest req,Purchase pur) {
			Integer selUId=Integer.parseInt(req.getParameter("seluid"));
			
			if(selUId==0) {
				List<Purchase> listOfPurchase=purchaseService.getAllPurchase();
				req.setAttribute("listOfPurchase", listOfPurchase);
			}else {
				pur.setPuruserid(selUId);
				List<Purchase> listOfPurchase=purchaseService.getSelectedIdPurchase(pur);
				req.setAttribute("listOfPurchase", listOfPurchase);
				
				if(listOfPurchase.size()==0) {
					listOfPurchase=purchaseService.getAllPurchase();
					req.setAttribute("listOfPurchase", listOfPurchase);
					req.setAttribute("msg", "No selection matching userid");
				}
				return "listOfPurchase";
			}
			return "listOfPurchase";
		}
		
}
