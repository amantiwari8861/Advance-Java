//package com.pack;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Collection;
//import java.util.Enumeration;
//import java.util.Iterator;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "UserServlet", urlPatterns = {"/Tests"},
//	initParams={
//		@WebInitParam(name="name", value="Not provided"),
//		@WebInitParam(name="email", value="Not provided")})
//public class RequestHeaderCheck extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		PrintWriter out = response.getWriter();
//        String title = "HTTP Header Request Example";
//        String docType = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n";
//        out.println(docType +
//                "<html>\n" +
//                "<head><title>" + title + "</title></head>\n"+
//                "<body bgcolor = \"#f0f0f0\">\n" +
//                "<h1 align = \"center\">" + title + "</h1>\n" +
//                "<table width = \"100px\" border = \"1\" align = \"center\">\n" +
//                "<tr bgcolor = \"#949494\">\n" +
//                "<th>Header Name</th><th>Header Value(s)</th>\n"+
//                "</tr>\n");
// 
//        Enumeration<String> headerNames = request.getHeaderNames();
//        while(headerNames.hasMoreElements()) {
//            String paramName = (String)headerNames.nextElement();
//            out.print("<tr><td>" + paramName + "</td>\n");
//            String paramValue = request.getHeader(paramName);
//            out.println("<td> " + paramValue + "</td></tr>\n");
//        }
//        out.println("</table>\n");
//		
//        
//        //---------------------------------------------------------------------
//
//        String title1 = "HTTP Header Response Example";
//        String docType1 = "<!DOCTYPE html>\n";
//        out.println(docType1 +
//                "<html>\n" +
//                "<head><title>" + title1 + "</title></head>\n"+
//                "<body bgcolor = \"#f0f0f0\">\n" +
//                "<h1 align = \"center\">" + title1 + "</h1>\n" +
//                "<table width = \"100px\" border = \"1\" align = \"center\">\n" +
//                "<tr bgcolor = \"#949494\">\n" +
//                "<th>Header Name</th><th>Header Value(s)</th>\n"+
//                "</tr>\n");
// 
//        Collection<String> resheaderNames = response.getHeaderNames();
//        Iterator<String> itr=resheaderNames.iterator();
//        while(itr.hasNext()) {
//            String paramName = (String)itr.next();
//            out.print("<tr><td>" + paramName + "</td>\n");
//            String paramValue = response.getHeader(paramName);
//            out.println("<td> " + paramValue + "</td></tr>\n");
//        }
//        out.println("</table>\n</body></html>");
//	}
//}
