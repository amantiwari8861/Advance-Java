package com.s1.s2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesImp")
public class CookiesImp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		String uname=URLEncoder.encode(request.getParameter("email"),"UTF-8");
		//if we need space in cookies value then we must have to use URLEncoder to encode into UTF-8
		//and it will replace space with + symbol
		//we can also use String.replace(" ","xyz"); to replace space 
		Cookie ck1=new Cookie("username",uname);
		Cookie ck2=new Cookie("password",URLEncoder.encode(request.getParameter("password"),"UTF-8"));
		Cookie ck3=new Cookie("one",String.valueOf(1));
		Cookie ck4=new Cookie("two",String.valueOf(2));
		Cookie ck5=new Cookie("three",String.valueOf(3));
		
		ck1.setMaxAge(60*60*60);
		ck1.setComment("it is storing username");
		response.addCookie(ck1);
		ck2.setSecure(true);
		response.addCookie(ck2);
		ck3.setHttpOnly(true);
		response.addCookie(ck3);
		ck4.setValue(URLEncoder.encode("value is twoooo","UTF-8"));
		response.addCookie(ck4);
		response.addCookie(ck5);
		Cookie cookies[]=request.getCookies();
		
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				pw.println(cookie.getName()+" is :" +cookie.getValue()+"</br>");
			}
		}
		else
		{
			pw.println("there is no cookies");
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
