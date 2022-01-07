package com.pack1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class AuthenticateUser1 implements Filter {

	String ip=null;
	
	public void destroy() {
		System.out.println("filter destroyed");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		System.out.println("filter invoked");
		System.out.println("your ip is :"+ip);

		if(uname.equals("aman") && pass.equals("123"))
		{
			request.getRequestDispatcher("/LoginServlet").forward(request, response);;
		}
		{
			response.setContentType("text/html");
			response.getWriter().append("username or password wrong !");
			request.getRequestDispatcher("/index.html").include(request, response);;
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		this.ip=fConfig.getInitParameter("validip");
		System.out.println("filter initialized");
	}

}
