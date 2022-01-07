import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter{

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();
		out.print("filter is invoked before without any html or servlet");
		
		chain.doFilter(req, resp);//sends request to next resource
		
		out.print("filter is invoked after doing work ");
		
		
	}
	public void destroy() {
		System.out.println("destroy");
	}

	

}
