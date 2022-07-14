package Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import Model.StudentDAO;
import Model.StudentDaoImp;

//@WebServlet("/DaoOperationDemo")
public class DaoOperationDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentDAO stobj=new StudentDaoImp();//overriding
		ArrayList<Student> students=null;
		try {
			students = stobj.getAllStudent();//getting arraylist object of Student Class
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
//		students.forEach(st->{
//			System.out.println("username : "+st.getUsername()+" Password :"+st.getPassword());
//		});
		
		for (Student st : students) {
			System.out.println("username : "+st.getUsername()+" Password :"+st.getPassword());
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
