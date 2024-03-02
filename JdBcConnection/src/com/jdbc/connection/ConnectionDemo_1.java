package com.jdbc.connection;
import java.sql.*;
public class ConnectionDemo_1 {

	public static void main(String[] args) throws SQLException
	{
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentJ","root","Ashiucristo@1");
//        System.out.println("connected succesfully"+conn);
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, user, pass);
			System.out.println("connected succesfully"+conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
