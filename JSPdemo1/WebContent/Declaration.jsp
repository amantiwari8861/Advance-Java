<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% //scriptlet
		int a=10;
// 		void add() error
// 		{
// 			out.print("hello");
// 		}
	
	%>

	<%
		out.println("a = "+a);
		//add(); error
	%>
	
	<%! //Declarative 
		void add()
		{
			System.out.println("hello");
		}
		int sum(int a,int b)
		{
			return a+b;
		}
		class abc
		{
			int num=50;
			void add()
			{
				System.out.println("hello add");
			}
		}
	
	
	%>
	
	<%
		add();
	
		out.print("sum : "+sum(10,30));
		out.print(new abc().num);
		new abc().add();
		abc a1=new abc();
		a1.add();
		out.print("<br>");
	%>
	<%= a1.num %> <!--  Expression -->
	<%= 56*2 %>
	<span style="color:red"><%= sum(10,50) %></span>
	

</body>
</html>