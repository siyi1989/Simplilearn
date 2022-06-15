package com;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.PrintWriter;

import java.io.IOException;


/**
 * Servlet implementation class DemoApp
 */
public class DemoApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    
    int num=100;
    //ServletContext sc;
    //right click source>override
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//		super.init(config);
//		sc=config.getServletContext();// it will provide servlet context reference
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("In Servlet Page<br/>");
		pw.println("Value of num is"+num);
		HttpSession hs=request.getSession();//can use session to retain obj value to use redirect method
		request.setAttribute("obj", num); //set value with key obj
		hs.setAttribute("obj1", num);
		//sc.setAttribute("obj2", num);
		//RequestDispatcher rd1=request.getRequestDispatcher("demo.jsp");
		//rd1.include(request,response);
		//rd1.forward(request,response);
		//hs.invalidate();//session get destroyed
		response.sendRedirect("demo.jsp"); //value return is null because destroyed upon redirect. 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
