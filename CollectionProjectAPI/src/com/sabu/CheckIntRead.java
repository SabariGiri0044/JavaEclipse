package com.sabu;

import java.util.Scanner;

public class CheckIntRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter val: ");
		
		if(scan.hasNextInt())
		{
			//int x=scan.nextInt();
			float x=scan.nextFloat();
			System.out.println("Your entered  val: "+x);
			
		}
		else
		{
			System.out.println("pls enter the int val. ");
			
		}
		scan.close();
	}

}
