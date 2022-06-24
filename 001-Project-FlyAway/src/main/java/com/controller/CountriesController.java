package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Countries;
import com.service.CountriesService;

/**
 * Servlet implementation class ProductController
 */
public class CountriesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountriesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    

    CountriesService cs=new CountriesService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();

		List<Countries>listOfCountry=cs.getAllCountries();
		hs.setAttribute("listOfCountry", listOfCountry); 
		RequestDispatcher rd=request.getRequestDispatcher("storeCountries.jsp");
		rd.include(request, response);
		
		
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();

		String country=request.getParameter("country");
		

		Countries ctry=new Countries();
		ctry.setCcountry(country);
		
		
		String result=cs.storeCountries(ctry);
		
		if(result.equals("Country save success")) {
		pw.println("New country created. please create corresponding airport");
		RequestDispatcher rd1=request.getRequestDispatcher("storeAirports.jsp");
		rd1.forward(request, response);
		}else {
			pw.println("New country cannot be created. please check if duplicated in list");
			RequestDispatcher rd2=request.getRequestDispatcher("storeProduct.jsp");
			rd2.forward(request, response);
			
		}
	

	}
	
}
