package com.sabumaven;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionCreateDatatable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		final String URL = "jdbc:mysql://localhost:3306/userdetails";
		final String UN = "root";
		final String PASS = "Root123@";
		
		//1.Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Make a connection
		Connection con = DriverManager.getConnection(URL,UN,PASS);
		//Connection con = DriverManger.getConnection("jdbc:mysql://localhost/userDBname:3306/userDB","root","root")
		//3.Create a statement
		Statement st = con.createStatement();
		
		String s = "create table UserDetails(userid int(6) primary key, userpassword varchar(20))";
		
		st.execute(s);
		System.out.println("Table is created");
		
				
				
	}

}
