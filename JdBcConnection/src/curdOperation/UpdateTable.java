package curdOperation;

import java.sql.*;

public class UpdateTable {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		
		String sql="UPDATE STUDENT SET name ='DEEP' WHERE roll=3";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("Update successfully");

	}

}
