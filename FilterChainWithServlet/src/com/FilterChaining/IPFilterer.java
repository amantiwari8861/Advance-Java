package com.FilterChaining;

import java.io.IOException;
import java.net.InetAddress;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IPFilterer implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do filter called of IPFilter");
		InetAddress ia = InetAddress.getLocalHost();
//		System.out.println("local ip in ipv4 : "+ia.getHostAddress());
//		System.out.println("ip address in ipv6 : "+request.getRemoteAddr());
		
		if (ia.getHostAddress().startsWith("192.168") || request.getRemoteAddr().startsWith("192.168")) {
			System.out.println("valid ip ");
			chain.doFilter(request, response);//calls next filter in the row
		} else {
			System.out.println("invalid ip");
			request.getRequestDispatcher("Error404.html").forward(request, response);
		}
		System.out.println("back to ipfilter");
//		request.getRequestDispatcher("/LoginServlet").forward(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
//		fConfig.getServletContext().log("initialized logging of ipfilter");
		System.out.println("initialized ipfilter");
	}
}
//request.getRequestDispatcher("Success.html").forward(request, response);
//System.out.println(" localhost ip is :"+ia.getHostAddress());
//System.out.println("ip in ipv6 by request :"+request.getRemoteAddr());
//System.out.println("local address by ipv6 :"+request.getLocalAddr());
//System.out.println(((HttpServletRequest)request).getRequestURI());