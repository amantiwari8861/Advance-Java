/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Karuna.Sadh
 */
@WebFilter(filterName="IPFilter", servletNames={"GetLogDetails"})
public class IPFilter implements Filter {
private String validip;
@Override
    public void init(final FilterConfig filterConfig) throws ServletException
    {
        this.validip = filterConfig.getInitParameter("validip");
    }

    @Override
  public void doFilter(ServletRequest request,
    ServletResponse response, FilterChain chain)
    throws ServletException, IOException {
if (request.getRemoteAddr().equals(this.validip))
        {
    RequestDispatcher rd=request.getRequestDispatcher("/GetLogDetails");
     rd.forward(request,response);
      }
 else
      {
          RequestDispatcher rd=request.getRequestDispatcher("/ErrorServlet");
          rd.forward(request,response);
 }

           

       chain.doFilter(request, response);

}
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   

}
