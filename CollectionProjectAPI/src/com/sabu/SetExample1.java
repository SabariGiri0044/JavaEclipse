package com.sabu;
import java.util.Iterator;
import java.util.TreeSet;
public class SetExample1 {

	public static void main(String[] args) {
		TreeSet<String> a1=new TreeSet<String>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("Four");
		//Traversing ele Ascending by default
		Iterator<String> it=a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}

}
