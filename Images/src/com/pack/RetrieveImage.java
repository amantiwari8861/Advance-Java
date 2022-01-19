package com.pack;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/RetrieveImage")
public class RetrieveImage extends  HttpServlet{
  private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse 
  response) throws ServletException, IOException{
  //PrintWriter pw = response.getWriter();
  String connectionURL = "jdbc:mysql://localhost/jdbc";
  java.sql.Connection con=null;
  try{  
  Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection(connectionURL,"root","1234");  
  Statement st1=con.createStatement();
  ResultSet rs1 = st1.executeQuery("select data from"+
   " images where id=2");
  String imgLen="";
  if(rs1.next()){
  imgLen = rs1.getString(1);
  System.out.println(imgLen.length());
  }  
  rs1 = st1.executeQuery
  ("select data from images where id=2");
  if(rs1.next()){
  int len = imgLen.length();
  byte [] rb = new byte[len];
  InputStream readImg = rs1.getBinaryStream(1);
  int index=readImg.read(rb, 0, len);  
  System.out.println("index"+index);
  st1.close();
  response.reset();
  response.setContentType("image/gif");
  response.getOutputStream().write(rb,0,len);
  response.getOutputStream().flush();  
  }
  }
  catch (Exception e){
  e.printStackTrace();
  }
  }
}