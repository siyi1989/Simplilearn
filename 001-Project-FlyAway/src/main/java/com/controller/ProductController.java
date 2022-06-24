package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Airports;
import com.bean.Product;
import com.service.AirportService;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    ProductService ps=new ProductService();
    AirportService airs=new AirportService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();
		List<Product>listOfProduct=ps.getAllProductDetails();
		hs.setAttribute("listOfProduct", listOfProduct); 
		response.sendRedirect("displayAllProduct.jsp");	
		//RequestDispatcher rd1=request.getRequestDispatcher("displayAllProduct.jsp");
		//rd1.include(request, response);
		

		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();
		
		String fairline=request.getParameter("fairline");
		float fprice=Float.parseFloat(request.getParameter("fprice"));
		int fslot=Integer.parseInt(request.getParameter("fslot"));
		String fsource=request.getParameter("fsource");
		String fsourceport=request.getParameter("fsourceport");
		String fdestination=request.getParameter("fdestination");
		String fdestport=request.getParameter("fdestport");
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date fdate = null;
		try {
		 fdate = (Date)formatter.parse(request.getParameter("fdate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Product product=new Product();
		product.setFairline(fairline);
		product.setFprice(fprice);
		product.setFsource(fsource);
		product.setFsourceport(fsourceport);
		product.setFdestination(fdestination);
		product.setFdestport(fdestport);
		product.setFdate(fdate);
		product.setFslot(fslot);
		
		
		List<Airports> resultsource=airs.getSelectedAirport(fsourceport);
		List<Airports> resultdest=airs.getSelectedAirport(fdestport);
		
		RequestDispatcher rd1=request.getRequestDispatcher("storeProduct.jsp");
		
		if((!resultsource.contains(fsource)) || !resultdest.contains(fdestination) ) {
			pw.println("Mismatch between airport and country <br/> +Country from:"+resultsource+"Airport from:"+fsourceport+"<br/>Country to:"+resultdest+"Airport to:"+fdestport);
			rd1.include(request,response);
		}else{
			String result=ps.storeProduct(product);
			pw.println(result);
			rd1.include(request, response);
			}
		}

		
		
	

}
