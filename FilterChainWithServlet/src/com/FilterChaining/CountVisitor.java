package com.FilterChaining;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

public class CountVisitor implements Filter {

	static int count = 0;

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("initialized CountVisitor");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do filter called of CountVisitor");
		System.out.println("Total visitors " + (++count));
//		chain.doFilter(req, res); //error java.lang.IllegalStateException: Cannot forward after response has been committed
		req.getRequestDispatcher("Success.html").forward(req, res);
//		((HttpServletResponse)res).sendError(500, "chala ja ");
//		chain.doFilter(req, res); same error
		System.out.println("back to countvisitorfilter");

	}
}
