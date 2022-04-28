package com.sabu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemovingDupAfterUI {
	
	private String[] names;
	private ArrayList<String> al;
	public RemovingDupAfterUI(int n) {
		this.names = new String[n];
		this.al = new ArrayList<String>();
	}
	void createNames() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<names.length;i++) {
			names[i]=sc.nextLine();
			sc.close();
			
		}
	}
	void removeDuplicates()
	for(String str : names) {
		if(!al.contains(str))
			al.add(str);
	}
	void display() {
		Iterator<String> it=al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	ArrayList<String> names=new ArrayList<>();
	
	for(String s:names) {
		if(!(names.contains(s)))
	names.add(s);
	   
    }



	}

}
