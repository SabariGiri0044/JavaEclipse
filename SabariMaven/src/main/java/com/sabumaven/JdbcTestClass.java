package com.sabumaven;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcTestClass {
	

		public static void main(String args[]) throws SQLException{
			Connection conn = null;
			Statement statement = null;
	 
			String query = "insert into product values (7,'Washing machine3')";
	 
			try{			
				//get connection
				conn = ConnectionUtilityClasss.getConnection();
	 
				//create statement
				statement = conn.createStatement();
	 
				//execute query
				statement.executeUpdate(query);
	 
				
	 
		              System.out.println("Record inserted successfully.");
			}catch(Exception e){
				e.printStackTrace();
			}
			//finally {
				//close connection
				//statement.close();
				//conn.close();
				// best approach
				finally{
				   // close JDBC objects
				  
				   
				   try {
				      if(conn!=null) conn.close();
				   } catch (SQLException se) {
				      se.printStackTrace();
				   }
				}
			}
		}