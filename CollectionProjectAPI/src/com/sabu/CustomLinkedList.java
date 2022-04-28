package com.sabu;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int Empid;
	String EName;
	float ESalary;
	int Age;
	String Dept;
	
	public Employee(int Empid,String EName,float ESalary,int Age,String Dept) {
		super();
		
		this.Empid=Empid;
		this.EName=EName;
		this.ESalary=ESalary;
		this.Age=Age;
		this.Dept=Dept;
		
	}
}
public class CustomLinkedList {
	
	public static void main(String[] args) {
		Employee ob1=new Employee(101,"Sabu",25000,20,"CSE");
		Employee ob2=new Employee(102,"Sabari",25000,20,"CSE");
		Employee ob3=new Employee(103,"Sab",25000,20,"IT");
        Employee ob4=new Employee(104,"Giri",25000,20,"CSE");
	ArrayList<Employee> a1=new ArrayList<>();
	a1.add(ob1);
	a1.add(ob2);
	a1.add(ob3);
	a1.add(ob4);
	Iterator it=a1.iterator();
	System.out.println("EId\t EName \tAge \tDept \tESalary");
	while(it.hasNext())
	{
		Employee emp=(Employee) it.next();
		System.out.print(emp.Empid+"\t");
		System.out.print(emp.EName+"\t");
		
		System.out.print(emp.Age+"\t");
		System.out.print(emp.Dept+"\t");
		System.out.print(emp.ESalary+"\t");
		System.out.println();
	}
	}
}
