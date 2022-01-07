package com.pack;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CallFilter")
public class CallFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Attribute is: ").append((CharSequence) request.getAttribute("name"));
	
	
	}

	@Override
	public void init() throws ServletException {
		System.out.println("servlet initialized "+new Date());
	}
}
