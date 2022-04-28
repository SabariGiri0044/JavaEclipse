package com.sabumaven;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainJavaCrudOperations {
	static Connection conn=null;
	static Statement st=null;
	static Scanner sc;
	
	public static void selectRecord() throws SQLException {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			
			//select
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
	}
	public static void updateRecord() {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			
			//update
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteRecord() {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			//delete
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insertRecord() {
		try {
			conn=ConnectionUtilityClasss.getConnection();
			st=conn.createStatement();
			
			//insert
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		
		while(true) {
		System.out.println("**************MENU*********************");
		System.out.println("1.Add Record");
		System.out.println("2.Delete Record");
		System.out.println("3.Update Record");
		System.out.println("4.Display Record");
		sc=new Scanner(System.in);
		System.out.println("Enter your option");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: MainJavaCrudOperations.insertRecord();
		         break;
		case 2: MainJavaCrudOperations.deleteRecord();
        		break;
		case 3:MainJavaCrudOperations.updateRecord();
		break;
		case 4:MainJavaCrudOperations.selectRecord();
		break;
		         
		}
		System.out.println("Do you want to continue Y/N");
		char choice=sc.next().charAt(0);
		if(ch=='N' || ch=='n') {
			break;
		}
		}

	}

}



	