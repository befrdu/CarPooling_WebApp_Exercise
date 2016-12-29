package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.CarpoolingService;

/**
 * Servlet implementation class SignUp
 */
@WebServlet(description = "to be registered in the app", urlPatterns = { "/SignUp" })
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		CarpoolingService service=new CarpoolingService();
		
		
		boolean adduser=service.addUser(request );
		
		if(adduser){
			//redirect the user to the homepage
			response.sendRedirect("home.jsp");
		}
		else{
			//redirect the user to its own page for checking 
			response.sendRedirect("registration.jsp");
		}
		
		
	}

}
