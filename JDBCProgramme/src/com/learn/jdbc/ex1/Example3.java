package com.learn.jdbc.ex1;

import java.sql.*;
import java.sql.DriverManager;

public class Example3 {

	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/bank";
			String user="root";
			String pswd="Ashiucristo@1";
			
			String query="Select * from studentnew";
			Connection con=DriverManager.getConnection(url,user,pswd);
			
		    System.out.println("Connnected....>");
		    
		    Statement smt=  con.createStatement();
		    
		    ResultSet rs = smt.executeQuery(query);
		    
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2));
		    }
		    
			
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
