//
//package com.pack;
//
//import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebFilter("/AuthenticationFilter")
//public class AuthenticationFilter implements Filter {
//
//	@Override
//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest) req;
//		HttpServletResponse response = (HttpServletResponse) res;
//		if (!request.getRequestURI().contains("/login") && !request.getRequestURI().contains("/acd/appconfig")) {
//			RequestDispatcher dispatcher;
//			HttpSession session = request.getSession();
//			if (session != null) {
//				if (session.getAttribute("authName") == null || session.getAttribute("authRole") == null) {
//					response.sendRedirect("/login");
//					return;
//				}
//			} else {
//				request.setAttribute("fail_msg", "Session timed out!");
//				dispatcher = request.getRequestDispatcher("/Login");
//				dispatcher.forward(request, response);
//				return;
//			}
//		}
//		fc.doFilter(req, res);
//	}
//}
//
//@WebFilter("/*")
// class LoginFilter implements Filter {
//
//	@Override public void doFilter(ServletRequest req, ServletResponse res,
//  FilterChain chain) throws ServletException, IOException { HttpServletRequest
//  request = (HttpServletRequest) req; HttpServletResponse response =
//  (HttpServletResponse) res; HttpSession session = request.getSession(false);
//  String loginURI = request.getContextPath() + "/login";
//  
//  boolean loggedIn = session != null && session.getAttribute("user") != null;
//  boolean loginRequest = request.getRequestURI().equals(loginURI);
//  
//  if (loggedIn || loginRequest) { chain.doFilter(request, response); } else {
//  response.sendRedirect(loginURI); } }
//
// }
