package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Airlines;
import com.service.AirlineService;

/**
 * Servlet implementation class ProductController
 */
public class AirlineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AirlineController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    AirlineService airs=new AirlineService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();
		List<Airlines>listOfAirline=airs.getAllAirline();
		hs.setAttribute("airline", listOfAirline); 	
		RequestDispatcher rd1=request.getRequestDispatcher("storeAirlines.jsp");
		rd1.include(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();


		String airlinename=request.getParameter("airlinename");
		
		Airlines air=new Airlines();
		air.setLairline(airlinename);
		
		String result=airs.storeAirline(air);
		pw.print(result);
		RequestDispatcher rd1=request.getRequestDispatcher("storeAirlines.jsp");
		rd1.include(request, response);
		
	}

}
