package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Airlines;
import com.bean.Countries;
import com.bean.Product;
import com.service.ProductService;
import com.service.CountriesService;

/**
 * Servlet implementation class ProductController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    ProductService ps=new ProductService();
    CountriesService cs=new CountriesService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();
		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date fromDate = null;
//		try {
//			fromDate = (Date)formatter.parse(request.getParameter("tripStart"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Date toDate = null;
//		try {
//		 toDate = (Date)formatter.parse(request.getParameter("tripEnd"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String fsource=request.getParameter("fsource");
		String fdestination=request.getParameter("fdestination");
		Object fromDate=request.getParameter("tripStart");
		Object toDate=request.getParameter("tripEnd");
		int reqslot=Integer.parseInt("reqslot");
		
		Product product=new Product();
		product.setFsource(fsource);
		product.setFdestination(fdestination);

		List<Product>listOfSelProduct=ps.getSelectedProduct(product, fromDate, toDate);
		hs.setAttribute("selproducts", listOfSelProduct); 
		hs.setAttribute("reqslot",reqslot);
		
			
		RequestDispatcher rd1=request.getRequestDispatcher("displaySelectedFlights.jsp");
		rd1.include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();
		
		int searchid=Integer.parseInt(request.getParameter("searchid"));
		hs.setAttribute("fid", searchid);
		
		Product product=new Product();

		List<Product>listOfConfirmProduct=ps.confirmProduct(product, searchid);
		hs.setAttribute("confirmproduct", listOfConfirmProduct); 
		
		RequestDispatcher rd1=request.getRequestDispatcher("checkProduct.jsp");
		rd1.forward(request, response);

}
}
