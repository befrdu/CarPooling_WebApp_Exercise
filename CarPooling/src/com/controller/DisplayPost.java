package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.UserPost;
import com.service.CarpoolingService;

/**
 * Servlet implementation class DisplayPost
 */
@WebServlet("/DisplayPost")
public class DisplayPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		CarpoolingService service=new CarpoolingService();
		List<UserPost>posts=service.retrievePost();
		Gson gson=new Gson();
		out.print(gson.toJson(posts));
		out.flush();
		out.close();
	}

}
