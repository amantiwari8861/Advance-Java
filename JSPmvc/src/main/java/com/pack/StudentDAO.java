package com.pack;


import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDAO {

	public abstract ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException;
	
}
