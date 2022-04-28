package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 final String URL="jdbc:mysql://localhost:3306/edudb";
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
	//Connection conn=DriverManager.getConnection(""jdbc:mysql://localhost/edudb:3306",""root","root");
  //3.create a Statement 
	  st=conn.createStatement();
	  System.out.println("Enter id to delete record");
	  int id=sc.nextInt();
		String sel ="select * from mylogin where id="+id;
		ResultSet rs=st.executeQuery(sel);
		if(rs.next()) {
			String delr="delete from mylogin where id="+id;
			int i=st.executeUpdate(delr);
			if(i>0) {
				System.out.println("Record deleted");
			}else {
				System.out.println("Record not deleted");
			}
		}else {
			System.out.println(id+" not exists deletion not possible");
		}
	  
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
  }//main

}//class