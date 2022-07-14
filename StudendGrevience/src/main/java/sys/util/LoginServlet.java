package sys.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			 con=ConnectionProvider.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			 st=con.createStatement();
			rs=st.executeQuery("select * from students where name='"+email+"' and password='"+password+"';");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rs==null)
		{
			request.getRequestDispatcher("/Error.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/login.jsp").include(request, response);
			request.setAttribute("err", "invalid login !");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
