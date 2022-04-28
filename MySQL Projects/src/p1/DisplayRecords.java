package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayRecords {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	 final String URL="jdbc:mysql://localhost:3306/mydatabase";
	 final String UN="root";
	 final String PASS="Root123@";
	 Connection conn=null;
	 Statement st=null;
	 ResultSet rs=null;
	 Scanner sc= new Scanner(System.in);
	 try {
  //1. Load the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//2. Make a connection
	 conn=DriverManager.getConnection(URL,UN, PASS);
	//Connection conn=DriverManager.getConnection(""jdbc:mysql://localhost/edudb:3306",""root","root");
  //3.create a Statement 
	  st=conn.createStatement();
	  
	  String sel="select * from mylogin";
	  rs=st.executeQuery(sel);
	  System.out.println("Id\tName");
	  while(rs.next()) {
		  int id=rs.getInt(1); //or rs.getInt("id");
		  String n=rs.getString(2); //or rs.getString("name");
		  System.out.println(id+"\t"+n);
	  }
	  
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 finally {
		 rs.close();
		 st.close();
		 conn.close();
	 }
	}

}