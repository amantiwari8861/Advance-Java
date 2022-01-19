package com.pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		http -> stateless 
//		variable=fields=states
		
		HttpSession session=request.getSession(true);
		session.setAttribute("name",request.getParameter("username"));
		session.setAttribute("pass",request.getParameter("password"));
		System.out.println("in sessionDemo servlet ");
//		response.getWriter().append("<a href='Welcome'>Go on welcome</a>" );
		
		System.out.println("session id :"+session.getId());
		System.out.println("last accessed "+session.getLastAccessedTime());
		System.out.println("max inactive "+session.getMaxInactiveInterval());
		System.out.println(" creation time "+session.getCreationTime());
		System.out.println("is new ? "+session.isNew());
		
//		response.sendRedirect("Welcome");
//		response.sendRedirect("https://www.google.com/search?q="+session.getAttribute("name"));
		
		response.sendRedirect("UrlRewriting?name=aman&institute=Niit");
		System.out.println("after send redirect it will work");
		
//		in request dispatcher the user doesn't know that how many times a request is sent to another pages 
//		while in sendredirect user knows that he/she is redirected to another url
		
//		// Sends a temporary redirect to the HTTP client. Only absolute URLs are allowed.
//		HttpServletResponse.sendRedirect(String location);
//		// Delegates one HttpRequest to another dynamic or static resource
//		HttpServletRequest.getRequestDispatcher("example.jsp").forward(request, response);
//		// Includes/enriches current response with another dynamic or static resource
//		HttpServletRequest.getRequestDispatcher("example.html").include(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
