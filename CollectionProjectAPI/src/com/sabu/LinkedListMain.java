package com.sabu;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Product implements Comparable<Product>{
	int id;
	String name;
	float price;
	String expDate;
	public Product(int id, String name, float price, String expDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.expDate = expDate;
	}
	public int compareTo(Product a) {
		// TODO Auto-generated method stub
		return this.id - a.id;
	}
}
class NameCompare implements Comparator<Product>{
	public int compare(Product a, Product b) {
		return a.name.compareToIgnoreCase(b.name);
	}
}
class PriceCompare implements Comparator<Product>{
	public int compare(Product a, Product b) {
		if(a.price<b.price)
			return -1;
		else if(a.price>b.price)
			return 1;
		else 
			return 0;
	}
}

public class LinkedListMain {
	public static void printList(LinkedList<Product> ll) {
		Iterator<Product> itr = ll.iterator();
		while(itr.hasNext()) {
			Product a = itr.next();
			System.out.print(a.id+" "+a.name+" "+a.price+" "+a.expDate);
						System.out.println();
					}
				}
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					Product p1 = new Product(7, "Pen", 50.0f, "07/02/2034");
					Product p2 = new Product(10, "Book", 500.35f, "25/03/2030");
					Product p3 = new Product(9, "Paper", 10, "10/10/2025");
					LinkedList<Product> ll = new LinkedList<Product>();
					ll.add(p1);
					ll.add(p2);
					ll.add(p3);
					Collections.sort(ll);
					printList(ll);
					System.out.println("---------------------------");
					NameCompare nc = new NameCompare();
					Collections.sort(ll, nc);
					printList(ll);
					System.out.println("---------------------------");
					PriceCompare pc	= new PriceCompare();
					Collections.sort(ll,pc);
					printList(ll);
				}

			}

