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

@WebServlet("ViewProducts")
public class ProductServlet extends HttpServlet {
	
	
	@Autowired
	ProductService prodService;
	
	@Autowired
	CategoryService catService;


	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(ModelMap map,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("remove")) {
				doGet_Remove(request, response);
			}

	
}


	protected void doGet_Remove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer id=Integer.parseInt(request.getParameter("prodid"));
		String result=prodService.deleteProductInfo(id);
		session.setAttribute("msg", result);
		response.sendRedirect("ViewProduct.jsp");
	}
	
}
