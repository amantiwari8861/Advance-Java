package com.pack;


import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {

	public abstract ArrayList<StudentBean> getAllStudent() throws SQLException, ClassNotFoundException;
	
}
