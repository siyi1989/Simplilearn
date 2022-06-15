package com;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    int count =0;
    
    //*******Note: to run below code enter URL directly in chrome after running in server. Add "/SessionDemo" to url
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		pw.println("<br/> Value of count is "+count);
		
		if(hs.isNew()) {
			pw.println("New Client<br/>");
		}else {
			pw.println("Old Client<br/>");
		}
		pw.println("<br/>Session id is "+hs.getId());
		pw.println("<br/>Session creation time "+new Date(hs.getCreationTime()));
		pw.println("<br/>Session last accessed time "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/>Session default time "+hs.getMaxInactiveInterval()); //default 3min
		hs.setMaxInactiveInterval(600);
		pw.println("<br/>Session after set time "+hs.getMaxInactiveInterval()); 
		count++;
		if (count%5==0) {
			hs.invalidate(); //destroy session
			
		}
		count++;
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
