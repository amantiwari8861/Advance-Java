package com.pack;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {
	public void destroy() {
		System.out.println("filter destroyed "+new Date());
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		System.out.println("dofilter invoked "+new Date());
		request.setAttribute("name", "Aman");
		chain.doFilter(request, response);
		System.out.println("dofilter invoked again after calling filterchain "+new Date());
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter initialized "+new Date());
	}

}
