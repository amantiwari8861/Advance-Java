package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConnectWithHTML")
public class ConnectWithHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletConfig config=null; //tell about the configuration of servlet (web.xml)
	ServletContext st=null; //to get the object of current servlet
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config); //this is compulsory to get the config object
		this.config=config; //left side (instance variable or global variable)
		//right side (local variable)
		//this represents  current class object
	}
	public String getServletInfo() {
		return "this servlet will add 2 number"; 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter print=response.getWriter();
		response.setContentType("text/html");
//		print.println(getServletInfo());
//		System.out.println(config);
//		System.out.println();
		print.println(getServletConfig().getInitParameter("Student"));
		print.println(config.getInitParameter("Student"));
//		System.out.println(config.getServletContext());
		//context -> object
		st=config.getServletContext();
		
		st.setAttribute("name", "divyanshu");
		st.setAttribute("golu", "sourav");
		
		print.println("hello "+ st.getAttribute("name"));
		print.println("<br>hello "+ st.getAttribute("golu"));
		
	}

}
