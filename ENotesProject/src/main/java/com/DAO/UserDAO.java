package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.User.UserDetails;

public class UserDAO {
	private Connection con;
	
	public UserDAO(Connection con)
	{
		super();
		this.con=con;
	}
	
	public boolean addUser(UserDetails ud)
	{
		boolean f =false;
		try {
			String query= "insert into user values(?,?,?)";
		
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ud.getName());
			ps.setString(2, ud.getEmail());
			ps.setString(3, ud.getPassword());
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				f=true;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return  f;
		
	}
}