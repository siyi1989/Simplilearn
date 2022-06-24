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
		PrintWriter pw=response.getWriter();
		
		HttpSession hs=request.getSession();

		List<Airlines>listOfAirline=airs.getAllAirline();
		hs.setAttribute("listOfAirline", listOfAirline); 	
		RequestDispatcher rd1=request.getRequestDispatcher("storeAirlines.jsp");
		rd1.include(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();


		String airlinename=request.getParameter("airline");
		
		Airlines air=new Airlines();
		air.setLairline(airlinename);
		String result=airs.storeAirline(air);
		
		
		if(result.equals("Airline save success")) {
		pw.println("New airline created");
		RequestDispatcher rd1=request.getRequestDispatcher("storeProduct.jsp");
		rd1.forward(request, response);
		}else {
			pw.println("New airline cannot be created. please check if already in list");
			RequestDispatcher rd2=request.getRequestDispatcher("storeAirlines.jsp");
			rd2.include(request, response);
			
		}
		
	}

}
