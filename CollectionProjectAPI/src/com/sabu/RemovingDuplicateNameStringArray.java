package com.sabu;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingDuplicateNameStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"Sabu","Sabari","Sabari","Giri"};
		ArrayList<String> namelist=new ArrayList<>();
		
		for(String s:name) {
			if(!(namelist.contains(s)))
		namelist.add(s);
		   
	    }
	Iterator it=namelist.iterator();
	System.out.println("After Rmvng Dup Names");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
	}
	
