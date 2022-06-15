package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		//created java bean class object and set the value receive from form
		Login ll=new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		//create service class object and call service method
		LoginService ls=new LoginService();
		String result=ls.checkUser(ll);
		
		RequestDispatcher rd1=request.getRequestDispatcher("success.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("failure.jsp");
		
		
		if(result.equals("success")) {
			rd1.forward(request, response);
		}else {
			rd2.forward(request, response);
		}
		
	}

}
