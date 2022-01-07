/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author Karuna.Sadh
 */
public class LoggingFilter implements Filter {

 private FilterConfig config;
 private ServletContext context;
   @Override
  public void init(FilterConfig config)
    throws ServletException {
this.config = config;
  context = config.getServletContext();
     }

    @Override
  public void doFilter(ServletRequest request,
    ServletResponse response, FilterChain chain)
    throws ServletException, IOException {
HttpServletRequest req = (HttpServletRequest)request; // Casting ServletRequest to HttpServletRequest

       String requestURL = req.getRequestURL().toString();
       String userid=req.getParameter("uid");
       Date d=new Date();
       
      FileWriter first = new FileWriter(new File("log.txt"),true);
      BufferedWriter br=new BufferedWriter(first);
      br.append("Logged in by User:"+userid+" Time:"+d.toGMTString());
      br.newLine();

//      first.append("Logged in by User:"+userid+" Time:"+d.toGMTString());
//      first.append("\n");
//
br.close();

            context.log(
                           "***********Requesting URL: "+requestURL+"By User:"+userid+" Time:"+new Date()); //Log the details
       // pass the request along the filter chain
       chain.doFilter(request, response);

}
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}