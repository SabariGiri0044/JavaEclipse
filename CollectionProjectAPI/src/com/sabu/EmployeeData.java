package com.sabu;

public class EmployeeData {

	class Employee{
		public int id;
		public String Name;
		public double Salary;
		public String Dept;
		public Employee(int id,String Name,double Salary,String Dept) {
			this.id=id;
			this.Name=Name;
			this.Salary=Salary;
			this.Dept=Dept;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return Name;
		}
			public double getSalary() {
			return Salary;
		}
	}
	public class EmpTreeSetEX{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}
}


/*import java.io.*;
import java.util.*;
class students{

	private int marks;
	private String name;

	// constructor
	public students(int value, String name)
	{
		this.marks=value;
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
}

// Comparator class will override the compare
// method which will compare the two objects
// passed in the parameter
class myMarksComparator implements Comparator<students>
{

	public int compare(students s1, students s2)
	{
		return s1.getMarks()-s2.getMarks();
	}
}

class myNameComparator implements Comparator<students>
{
	public int compare(students s1, students s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}

GeeksforGeeks
*/
