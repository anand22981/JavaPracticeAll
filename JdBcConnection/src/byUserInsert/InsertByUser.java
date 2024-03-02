package byUserInsert;
import java.sql.*;
import java.util.Scanner;
public class InsertByUser {

	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		String url="jdbc:mysql://localhost/studentJ";
		String user="root";
		String pass="Ashiucristo@1";
		String sql="INSERT INTO student VALUES(?,?)";
		System.out.println("enter your roll_NO");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your Name");
		String name=sc.next();
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.executeUpdate();
		System.out.println("data store successfully");

	}

}
