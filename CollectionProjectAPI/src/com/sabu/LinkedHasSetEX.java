package com.sabu;

import java.util.Iterator;
import java.util.TreeSet;

public class LinkedHasSetEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a1=new TreeSet<String>();
		a1.add("sabu");
		a1.add("sabari");
		a1.add("Giri");
		a1.add("sabu");
		//Traversing ele Ascending by default
		Iterator<String> it=a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Traversing ele thr Iterator in dec order");
		Iterator i=a1.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
			
		}
		

	}
