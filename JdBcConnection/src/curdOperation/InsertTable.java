package curdOperation;

import java.sql.*;

public class InsertTable {

	public static void main(String[] args) throws SQLException
	{
		
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		
		String sql="INSERT INTO STUDENT VALUES(4,'Martin')";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("data store successfully");

	}

}
