package sys.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sys.entity.Student;

public interface StudentDAO 
{

	 ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException;
	
}
