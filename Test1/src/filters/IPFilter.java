//package filters;
//
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//
//@WebFilter("/index2.html")
//public class IPFilter implements Filter {
//private String validip;
//FilterConfig filterConfig;
//@Override
//    public void init(final FilterConfig filterConfig) throws ServletException
//    {
//        this.validip = filterConfig.getInitParameter("validip");
//        System.out.println("init ip : "+validip);
//    }
//    @Override
//  public void doFilter(ServletRequest request,
//    ServletResponse response, FilterChain chain)
//    throws ServletException, IOException {
//    System.out.print("filter is invoked before 1");  
//    System.out.println("ip address"+request.getRemoteAddr());
//if (request.getRemoteAddr().equals(this.validip))
//        {
//    RequestDispatcher rd=request.getRequestDispatcher("/index2.html");
//     rd.forward(request,response);
//      }
// else
//      {
//	    System.out.print("else is invoked ");  
//          RequestDispatcher rd=request.getRequestDispatcher("/Error404.html");
//          rd.forward(request,response);
//          chain.doFilter(request, response);
//
// }
//}
//    @Override
//    public void destroy() {
//        this.filterConfig = null;
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//   
//
//}
