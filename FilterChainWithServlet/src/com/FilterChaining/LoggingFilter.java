package com.FilterChaining;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter {

	static int count = 0;

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("initialized logging filter");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do filter called of LoggingFilter");
		long before = System.currentTimeMillis();
		chain.doFilter(req, res);
		System.out.println("back to loggingfilter");
		long after = System.currentTimeMillis();
		System.out.println("Total response time " + (after - before) +" miliseconds");

	}
}