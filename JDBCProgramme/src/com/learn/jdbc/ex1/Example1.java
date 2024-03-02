package com.learn.jdbc.ex1;
//1. import java.sql package
import java.sql.*;
public class Example1 {

	public static void main(String[] args) {
		
		try {          
		//api:to connect with:where:port:dbname
			String url="jdbc:mysql://localhost:3306/bank";
			String username="root";
			String password="Ashiucristo@1";
        //2. loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		//3 Establishing the connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connection is established at"+con);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
