package com.pack;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Tests")
public class Tests extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	public ServletConfig getServletConfig() {
		
		return this;
	}

	public String getServletInfo() {
		
		return "this is created by aman"; 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config=getServletConfig();  
	    String driver=config.getInitParameter("");  
	    System.out.println("Driver is: ");  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
