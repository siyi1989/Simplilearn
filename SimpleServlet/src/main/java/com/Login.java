package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html"); //output consider as html 
	PrintWriter pw=response.getWriter();
	 String email=request.getParameter("email");
	 String password=request.getParameter("password");
	
	 RequestDispatcher rd1=request.getRequestDispatcher("Home");
	 RequestDispatcher rd2=request.getRequestDispatcher("Login.html");
	 
	 
	 if(email.equals("raj@gmail.com")&& password.equals("123")) {
		 pw.println("successfully login<br/>");
		 pw.println("you can processed...");
		 rd1.forward(request, response); // can see output of one target page
		 
	 }else {
		 pw.println("failure try again");
		 rd2.include(request, response);
	 }
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html"); //output consider as html 
		PrintWriter pw=response.getWriter();
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		 
		 RequestDispatcher rd1=request.getRequestDispatcher("Home");
		 RequestDispatcher rd2=request.getRequestDispatcher("Login.html");
		 
		 if(email.equals("raj@gmail.com")&& password.equals("123")) {
			 pw.println("successfully login<br/>");
			 pw.println("you can processed...");
			 rd1.forward(request, response); // can see output of one target page
			 
		 }else {
			 pw.println("failure try again");
			 rd2.include(request, response);
		 }
	}

}
