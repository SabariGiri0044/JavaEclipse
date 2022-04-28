package com.sabu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class UsingUserIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of names");
		int names=sc.nextInt();
		s=new String[names];
		
		System.out.println("Enter Names "+s);
		for(int name=0;name<s.length;name++) {
			
			s[name]=sc.nextLine();
			
			
		}
		//disp
		
System.out.println("Names");
for(int name=0;name<s.length;name++) {
  System.out.println(s[name]);
}
	}

}
