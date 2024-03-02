package featchingDataFromSql;

import java.sql.*;

public class FeatchData {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		String sql = "SELECT * FROM STUDENT";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+" - "+rs.getString(2));
			
		}

	}

}
