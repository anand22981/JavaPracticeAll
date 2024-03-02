package com.insertObject;
import java.sql.*;
public class DbApp {
public static void insertObject(Student s) {
	int roll=s.getRoll();
	String name=s.getName();
	String branch=s.getBranch();
	//jdbc code
	String url="jdbc:mysql://localhost/studentj";
	String user="root";
	String pass="Ashiucristo@1";
	String sql="INSERT INTO  studentTable VALUES(?,?,?)";
	
	try {
		Connection con=DriverManager.getConnection(url, user, pass);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setString(3, branch);
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
}
}
