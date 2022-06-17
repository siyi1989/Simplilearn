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
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date fromDate = null;
		try {
			fromDate = (Date)formatter.parse(request.getParameter("tripStart"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date toDate = null;
		try {
		 toDate = (Date)formatter.parse(request.getParameter("tripEnd"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fsource=request.getParameter("fsource");
		String fdestination=request.getParameter("fdestination");
		int searchid=Integer.parseInt(request.getParameter("flightName"));
		
		Product product=new Product();
		product.setFsource(fsource);
		product.setFdestination(fdestination);

		List<Product>listOfProduct=ps.getSelectedProduct(product, fromDate, toDate);
		hs.setAttribute("selproducts", listOfProduct); 
		
		Countries ctry=new Countries();
		List<Countries>listOfCountry=cs.getAllCountries();
		hs.setAttribute("countries", listOfCountry);
		hs.setAttribute("bookId", searchid);	
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
		PrintWriter pw=response.getWriter();

		HttpSession hs=request.getSession();
		
//			
//		pw.println("row"+searchid);
//		RequestDispatcher rd1=request.getRequestDispatcher("userHome.jsp");
//		rd1.include(request,response);
//		
//		response.setContentType("text/html");		
//		PrintWriter pw=response.getWriter();
//			
//		
//		float fprice=Float.parseFloat(request.getParameter("fprice"));
//		int fslot=Integer.parseInt(request.getParameter("fslot"));
//		String fsource=request.getParameter("fsource");
//		String fsourceport=request.getParameter("fsourceport");
//		String fdestination=request.getParameter("fdestination");
//		String fdestport=request.getParameter("fdestport");
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date fdate = null;
//		try {
//		 fdate = (Date)formatter.parse(request.getParameter("fdate"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Product product=new Product();
//		product.setFairline(fairline);
//		product.setFprice(fprice);
//		product.setFsource(fsource);
//		product.setFsourceport(fsourceport);
//		product.setFdestination(fdestination);
//		product.setFdestport(fdestport);
//		product.setFdate(fdate);
//		product.setFslot(fslot);
//		
//		String result=ps.getAllProduct(product);
//		pw.print(result);
//		RequestDispatcher rd1=request.getRequestDispatcher("checkProduct.jsp");
//		rd1.include(request, response);
//		doGet(request,response);
//		
//	}
//	}

}
}
