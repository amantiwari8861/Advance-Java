package com.pack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImp implements StudentDAO {
	
	public ArrayList<StudentBean> getAllStudent() throws SQLException, ClassNotFoundException {		
		String Query="select * from userinfo;";
		Connection con=ConnectionProvider.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);//result is in tabular form
		ArrayList<StudentBean> udata=new ArrayList<StudentBean>();
		while(rs.next())
		{
			StudentBean stdata=new StudentBean();
			stdata.setUsername(rs.getString("username"));
			stdata.setPassword(rs.getString("password"));
			udata.add(stdata);
		}
		return udata;
	}
}
