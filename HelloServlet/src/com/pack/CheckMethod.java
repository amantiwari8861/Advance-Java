package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/CheckMethod", "/golu" })
public class CheckMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served by doGet at: ").append(request.getContextPath());
	
	PrintWriter page=response.getWriter();
	page.println("\n hello");
	page.println("hello2");
	page.println("<h1>hello3</h1>");
	response.setContentType("text/html");
	page.println("<h1>hello3</h1>");

	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served by doPost at: ").append(request.getContextPath());
//
//		doGet(request, response);
//	}

}
