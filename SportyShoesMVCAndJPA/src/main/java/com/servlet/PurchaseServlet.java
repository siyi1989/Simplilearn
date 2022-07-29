package com.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import com.bean.Category;
import com.bean.Product;
import com.service.CategoryService;
import com.service.ProductService;
import com.service.PurchaseService;

@WebServlet("ViewProductsUser")
public class PurchaseServlet extends HttpServlet {
	
	
	@Autowired
	ProductService prodService;
	
	@Autowired
	CategoryService catService;
	
	@Autowired
	PurchaseService purchaseService;


	public PurchaseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(ModelMap map,HttpServletRequest request, HttpServletResponse response,Product prod,Integer reqstk)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("buy")) {
				doGet_Buy(request, response,prod,reqstk);
			}

	
}

	
	protected void doGet_Buy(HttpServletRequest request, HttpServletResponse response,Product prod,Integer reqstk)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		reqstk=Integer.parseInt(request.getParameter("stk"));
		String result=prodService.UpdateProductInfo(prod, reqstk);
		
		session.setAttribute("msg", result);
		response.sendRedirect("ViewCart.jsp");
	}
	
}
