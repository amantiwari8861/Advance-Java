//package url;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/DispatchingRequest")
//public class DispatchingRequest extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//	    response.setContentType("text/html");  
//	    PrintWriter out = response.getWriter();  
//	          
//	    String e=request.getParameter("email");  
//	    String p=request.getParameter("password");  
//	          
//	    if(e.equals("aman") && p.equals("123")){  
//	        RequestDispatcher rd=request.getRequestDispatcher("GeneralServlet");  
//
//			String name=request.getParameter("email");  
//	        response.sendRedirect("https://www.google.com/search?q="+name); 
////	        rd.forward(request, response);  
//	    }  
//	    else{  
//	        out.print("Sorry UserName or Password Error!");  
//	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
//	        rd.include(request, response);
//	    }
//	            
//		
//		
//		
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
