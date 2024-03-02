package banking;
import java.sql.*;

public class BankApp {
	public static void main(String[] args) {
		//createTable();
		//createAccount();
		updateBalance();
	}

	public static void createTable() 
	{
		String url="jdbc:mysql://localhost/bank";
		String user="root";
		String pass="Ashiucristo@1";
		try {
			String sql="CREATE TABLE BANK(accNo INT ,Name varchar(20),balance INT)";
			Connection con=DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("sucessfullly created table");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void createAccount() 
	{
		String url="jdbc:mysql://localhost/bank";
		String user="root";
		String pass="Ashiucristo@1";
		try {
			String sql="INSERT INTO bank VALUES(111,'DEEP',25000),(2222,'ayusy',55000)";
			Connection con=DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("sucessfullly created table");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void updateBalance() 
	{
		String url="jdbc:mysql://localhost/bank";
		String user="root";
		String pass="Ashiucristo@1";
		Connection con=null;
		try {
			
			 con=DriverManager.getConnection(url, user, pass);
			con.setAutoCommit(false);//step1
			String sql1="UPDATE bank SET balance=55000 WHERE accNo=2222";
			String sql2="UPDATE bank SET balance=25000 WHERE accNo=111";
			Statement st = con.createStatement();
			st.execute(sql1);
			st.execute(sql2);
			con.commit();//step2
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
	}

}
