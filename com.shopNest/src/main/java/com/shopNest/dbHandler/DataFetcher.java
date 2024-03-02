package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataFetcher {
public static String featchPassword(String uname) {
	// String driver="ora";
	String url="jdbc:mysql://localhost/bank";
	 String user="root";
	 String password="root";
	 
	 String sql="Select pass FROM customers WHERE uname=?";
	 String dbPass="";
	 try {
		//Class.forName(driver);
		 Connection con=DriverManager.getConnection(url,user,password);
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setString(1,uname);
		 ResultSet rs = ps.executeQuery();
		 rs.next();
		 dbPass=rs.getString(1);
	 }catch(Exception e) {
		 System.out.println("login issue");
		 e.printStackTrace();
	 }
	 return dbPass;
	
}
public static List featchUserInfo() {
	String url="jdbc:mysql://localhost/bank";
	 String user="root";
	 String password="root";
	 String sql="SELECT uname,mail,gender,address FROM customer";
	 List ulist = new ArrayList();
	 try {
		 //class.forName("oracle.jdbc.drive.OracleDriver");
		 Connection con=DriverManager.getConnection(url,user,password);
		 Statement  s=con.createStatement();
		 
		 ResultSet rs = s.executeQuery(sql);
		 while(rs.next()) {
			 String temp = rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4);
		   ulist.add(temp);
		 }
	 }
	 catch(Exception e) {
		 System.out.println("Probelm IN lOING");
	 }
	 return ulist;
}
}
