package com.learn.jdbc.ex1;
import java.sql.*;
public class Example2 {

	public static void main(String[] args) 
	{
		try {
		String url="jdbc:mysql://localhost:3306/bank";
		String user="root";
		String pswd="Ashiucristo@1";
		//String query="CREATE TABLE STUDENT(ROLL INT,NAME VARCHAR(10))";
		//String query="Insert into student  values(1,'rohit'),(2,'mohit')";
//		String query="UPDATE STUDENT SET NAME='ASHIU' WHERE ROLL=1";
		String query="DELETE FROM STUDENT WHERE ROLL=2";
		//eSTABLISHED THE CONNECTION
		
			Connection con = DriverManager.getConnection(url, user, pswd);
			System.out.println("Connection  established");
			
			Statement smt = con.createStatement();
			//smt.execute(query);
			smt.executeUpdate(query);
			System.out.println("sql query get executed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
