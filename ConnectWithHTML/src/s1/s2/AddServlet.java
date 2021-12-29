package s1.s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		out=response.getWriter();
		response.setContentType("text/html");
		
		String fname1=request.getParameter("fname");
		String lname1=request.getParameter("lname");
		String num1=request.getParameter("textbox1");
		String num2=request.getParameter("textbox2");

		out.println(fname1);
		out.println(lname1);
		out.println(num1);
		out.println(num2);
		
//		String obj[]=request.getParameterValues(getServletName());
//		
//		for (String string : obj) {
//			out.println("<br>hi "+string);
//		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		out.println("in post method ");
		
	response.setContentType("text/html");
		
		String fname1=request.getParameter("fname");
		String lname1=request.getParameter("lname");
		String num1=request.getParameter("textbox1");
		String num2=request.getParameter("textbox2");

		out.println(fname1);
		out.println(lname1);
		out.println(num1);
		out.println(num2);
		
		
	}
	}

