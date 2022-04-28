package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlConnectMaven {

	
	public static void main(String[] args) throws SQLException {
	
		 final String URL="jdbc:mysql://localhost:3306/mydatabase";
		 final String UN="root";
		 final String PASS="Root123@";
		 Connection conn=null;
		 Statement st=null;
		 Scanner sc= new Scanner(System.in);
		 try {
	   //1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Make a connection
		 conn=DriverManager.getConnection(URL,UN, PASS);
		//Connection conn=DriverManager.getConnection(""jdbc:mysql://localhost/edudb:3306",""root","Root123@");
	   //3.create a Statement 
		  st=conn.createStatement();
		System.out.println("Connected...");
		System.out.println("Enter name");
		String n=sc.nextLine();
		System.out.println("Enter id");
		int id=sc.nextInt();
		String s="insert into mylogin values("+id+",'"+n+"')";
		System.out.println(s);
		int i=st.executeUpdate(s);
		
		if(i>0) {
			System.out.println("Record is inserted successfully");
		}
		else {
			System.out.println("Not inserted");
		}
		
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 st.close();
			 conn.close();
		 }
	}

}

