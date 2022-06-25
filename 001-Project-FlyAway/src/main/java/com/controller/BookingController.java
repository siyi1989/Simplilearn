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

import com.bean.Airlines;
import com.bean.Airports;
import com.bean.Booking;
import com.bean.Countries;
import com.bean.Product;
import com.service.AirlineService;
import com.service.AirportService;
import com.service.BookingService;
import com.service.CountriesService;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    BookingService bks=new BookingService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		
		
		response.setContentType("text/html");	
		
		HttpSession hs=request.getSession();
		
		int searchid=Integer.parseInt(request.getParameter("searchid"));
		hs.setAttribute("fid", searchid);
		
		Product product=new Product();

		ProductService ps=new ProductService();
		
		List<Product>listOfConfirmProduct=ps.confirmProduct(product, searchid);
		hs.setAttribute("confirmproduct", listOfConfirmProduct); 
		
		RequestDispatcher rd1=request.getRequestDispatcher("checkProduct.jsp");
		rd1.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");		
		PrintWriter pw=response.getWriter();
		
		HttpSession hs=request.getSession();
		hs.setAttribute("SessionId", hs.getId());
		
		String bss=hs.getId();
		String bairline=request.getParameter("bairline");
		float bprice=Float.parseFloat(request.getParameter("bprice"));
		float bpaid=Float.parseFloat(request.getParameter("bpaid"));
		int bslot=Integer.parseInt(request.getParameter("bslot"));
		String bsource=request.getParameter("bsource");
		String bsourceport=request.getParameter("bsourceport");
		String bdestination=request.getParameter("bdestination");
		String bdestport=request.getParameter("bdestport");
		int bfid=(int) hs.getAttribute("bookId");	
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date bdate = null;
		try {
		 bdate = (Date)formatter.parse(request.getParameter("bdate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:SS");
		Date bsstime = null;
		try {
		 bdate = (Date)formatter1.parse(request.getParameter("bsstime"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Booking book=new Booking();
		book.setBfid(bfid);
		book.setBss(bss);
		book.setBsstime(bsstime);
		book.setBpaid(bpaid);
		book.setBairline(bairline);
		book.setBprice(bprice);
		book.setBsource(bsource);
		book.setBsourceport(bsourceport);
		book.setBdestination(bdestination);
		book.setBdestport(bdestport);
		book.setBdate(bdate);
		book.setBslot(bslot);
		
		String result=bks.storeBooking(book);
		pw.println(result);
		RequestDispatcher rd1=request.getRequestDispatcher("Logout.jsp");
		rd1.include(request, response);
		doGet(request,response);
	}

}
