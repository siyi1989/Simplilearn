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

import com.bean.Airports;
import com.service.AirportService;

/**
 * Servlet implementation class ProductController
 */
public class AirportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AirportController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    

    AirportService ports=new AirportService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();

		List<Airports>listOfAirport=ports.getAllAirport();
		hs.setAttribute("listOfAirport", listOfAirport); 
		RequestDispatcher rd1=request.getRequestDispatcher("storeAirports.jsp");
		rd1.include(request, response);
		
		
//		PrintWriter pw=response.getWriter();
//		String country = request.getParameter("country");;
//		List<Airports>listOfSelectedAirports=ports.getSelectedAirport(country);
//		
//
//		hs.setAttribute("SelectedAirports", listOfSelectedAirports);
//		response.sendRedirect("storeProduct.jsp");	

//		RequestDispatcher rd2=request.getRequestDispatcher("searchProduct.jsp"); //using dropdown
//		rd2.include(request, response);
//		RequestDispatcher rd3=request.getRequestDispatcher("storeAirports.jsp");
//		rd3.include(request, response);
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();

		String airport=request.getParameter("airport");
		String country=request.getParameter("country");
		
		Airports port=new Airports();
		port.setAirport(airport);
		port.setccountry(country);
		
		
		String result=ports.storeAirport(port);
		
		if(result.equals("Airport save success")) {
		pw.println("New airport created");
		RequestDispatcher rd1=request.getRequestDispatcher("storeProduct.jsp");
		rd1.forward(request, response);
		}else {
			pw.println("New airport cannot be created. please check if already in list");
			RequestDispatcher rd2=request.getRequestDispatcher("storeAirports.jsp");
			rd2.include(request, response);	
			
		}
		
	

	}
	
}
