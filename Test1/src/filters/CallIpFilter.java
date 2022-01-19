//package filters;
//
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//public class CallIpFilter extends HttpServlet{ 
//	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		pw.println("<html>");
//		pw.println("<head><title>IP Filter Example</title></title>");
//		pw.println("<body>");
//		pw.println("<h1>Welcome, calling servlet successful</h1>");
//		pw.println("</body></html>");
//	}
//}