package com.controller;
import com.service.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogIn
 */
@WebServlet(description = "for gratting persmission to use the app", urlPatterns = { "/LogIn" })
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		CarpoolingService service=new CarpoolingService();
		String result=service.checkUser(request);
		
		if(result.equals("notConnected")){
			
			//redirect to itself
			
			
		}
		else if(result.equals("notRegister")){
			//redirect to itself with message registered before sign in
			response.sendRedirect("registration.jsp");
			
		}
		else if(result.equals("matched")){
			//create a session attribute that store necessary information. 
			HttpSession session = request.getSession();
			session.setAttribute("name", request.getParameter("firstname"));
			response.sendRedirect("home.jsp");
		}
		else {
			//redirect to it self to try again!
			response.sendRedirect("login.jsp");
		}
		
	
	}

}
