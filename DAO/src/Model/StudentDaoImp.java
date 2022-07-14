package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImp implements StudentDAO {
	
	public ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException {		
		String Query="select * from userinfo;";
		Connection con=ConnectionProvider.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);//result is in tabular form
		ArrayList<Student> udata=new ArrayList<Student>();
		while(rs.next())
		{
			Student stdata=new Student();
			stdata.setUsername(rs.getString("username"));
			stdata.setPassword(rs.getString("password"));
			udata.add(stdata);
		}
		return udata;
	}
}
