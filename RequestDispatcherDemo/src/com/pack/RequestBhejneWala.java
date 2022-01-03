package com.pack;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestBhejneWala")
public class RequestBhejneWala extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		PrintWriter out=response.getWriter();
		
//		response.getWriter().append(uname+" "+pass);
		RequestDispatcher dis=null;
		if (uname.equals("aman")&&pass.equals("123")) 
		{
			System.out.println("valid user at requestbhejnewala");
//			response.getWriter().append("welcome at request bhejne wala servlet: "+request.getParameter("username"));
			//will not print  
			dis=request.getRequestDispatcher("Welcome");
			 dis.forward(request, response);
		} 
		else {
//			dis=request.getRequestDispatcher("error.html");
//			dis.forward(request, response);
			dis=request.getRequestDispatcher("index.html");
			response.setContentType("text/html");			
			out.println("<script>alert('username or password is wrong!'); </script>" );
//			response.getWriter().append("<center><span style='color:red'>username or password is wrong !</span><center>");
			dis.include(request, response);
		}
	}

}
