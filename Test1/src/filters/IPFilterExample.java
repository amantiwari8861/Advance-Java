package filters;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class IPFilterExample implements Filter{
	public IPFilterExample() {}
	public final static String IP = "192.168.56.1";
	private FilterConfig filterConfig;
	
	public void init(FilterConfig config) throws ServletException{
		this.filterConfig = config;
	}
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain filterchain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>IP Filter Example</title></head>");
		String userip = request.getRemoteAddr();
		HttpServletResponse httpResponse = null;
		if (response instanceof HttpServletResponse){
			httpResponse = (HttpServletResponse) response;
		}
		if (IP.equals(userip)) {
			httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN,"You are not allowed to access the servlet!");			
		} else {
			filterchain.doFilter(request, response);
			out.println("<body><h3><font color='green'>Passed successfully from IP Filter<font></h3></body></html>");
		}
	}
	public void destroy() {}
}