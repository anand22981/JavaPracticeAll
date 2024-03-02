package curdOperation;
import java.sql.*;
public class CreateTableJdbc {

	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		String sql="CREATE TABLE STUDENT(roll Int,name VARCHAR(10))";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(sql);

	}

}
