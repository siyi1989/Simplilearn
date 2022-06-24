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
import com.bean.Airports;
import com.bean.Countries;
import com.service.AirlineService;
import com.service.AirportService;
import com.service.CountriesService;

/**
 * Servlet implementation class ProductController
 */
public class DropdownController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DropdownController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param fsource 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();
		
		HttpSession hs=request.getSession();

	    AirlineService airs=new AirlineService();
		List<Airlines>listOfAirline=airs.getAllAirline();
		hs.setAttribute("listOfAirline", listOfAirline); 	
		
		CountriesService cs=new CountriesService();
		List<Countries>listOfCountry=cs.getAllCountries();
		hs.setAttribute("listOfCountry", listOfCountry); 
	
		
		AirportService ports=new AirportService();

		List<Airports>listOfAirport=ports.getAllAirport();
		hs.setAttribute("listOfAirport", listOfAirport); 
		
//		List<Airports>listOfFsourceport=ports.getAllAirport();
//		hs.setAttribute("listOfFsourceport", listOfFsourceport); 
//		
//		List<Airports>listOfFdestport=ports.getAllAirport();
//		hs.setAttribute("listOfFdestport", listOfFdestport); 

//		String fsource=new String();
//		fsource=request.getParameter(fsource);
//		if(fsource!= null) {
//		List<Airports>listOfFsourceport=ports.getSelectedAirport(fsource);
//		hs.setAttribute("listOfFsourceport", listOfFsourceport);
//		}else {
//		List<Airports>listOfFsourceport=ports.getAllAirport();
//		hs.setAttribute("listOfFsourceport", listOfFsourceport); }
//		
//		String fdestination=request.getParameter("fdestination");
//		if(fdestination!= null) {
//		List<Airports>listOfFdestport=ports.getSelectedAirport(fdestination);
//		hs.setAttribute("listOfFdestport", listOfFdestport);
//		}else {
//		List<Airports>listOfFdestport=ports.getAllAirport();
//		hs.setAttribute("listOfFdestport", listOfFdestport); }
//		response.sendRedirect("storeProduct.jsp");	
		
		RequestDispatcher rd=request.getRequestDispatcher("storeProduct.jsp");
		rd.include(request, response);
		

		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
}
