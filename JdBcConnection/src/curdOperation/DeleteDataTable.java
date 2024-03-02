package curdOperation;
import java.sql.*;
public class DeleteDataTable {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		
		String sql="DELETE FROM STUDENT WHERE roll=3";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
		System.out.println("dELETE successfully");
		

	}

}
