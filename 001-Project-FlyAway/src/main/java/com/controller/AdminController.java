package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Login;
import com.dao.LoginDao;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		//receive value from view jsp file
		HttpSession hs=request.getSession();
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String newpassword1=request.getParameter("newpassword1");
		String newpassword2=request.getParameter("newpassword2");
		
		//create java class Date and set the class received from view
		Login ll=new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		Login ll1=new Login();
		ll1.setEmail(email);
		ll1.setPassword(newpassword1);
		
		//Create service class Date
		LoginService ls=new LoginService();
		String result=ls.checkAdminUser(ll);
		
		LoginService ls1=new LoginService();
		
		//pass login Date to service class
		if(result.equals("adminSuccess")) {
			if(newpassword1.equals(newpassword2)) {
			String result1=ls1.changeAdminPw(ll1);
			pw.println(result1);
			RequestDispatcher rd1=request.getRequestDispatcher("adminHome.jsp");
			rd1.include(request, response);

		}else {
			pw.println("New password re-entered does not match each other. Please re-enter.");
			RequestDispatcher rd2=request.getRequestDispatcher("adminChangePW.jsp");
			rd2.include(request,response);

		}
		
	}else {
		pw.println("Original password does not match records. Please re-enter.");
		RequestDispatcher rd2=request.getRequestDispatcher("adminChangePW.jsp");
		rd2.include(request,response);

	}
}
}
