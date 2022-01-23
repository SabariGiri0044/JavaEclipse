package MrSabuOOPs;

import java.util.Scanner;

class EmployeeDetails
{
	int eage;
	String ename;
	String edept;
	char egen;
	float esalary;


void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ename,eage,edept,egen,esalary");
	ename=sc.next();
	eage=sc.nextInt();
	edept=sc.next();
	egen=sc.next().charAt(0);
	esalary=sc.nextFloat();
	sc.close();
	
	
}

void display()
{
	System.out.println("employee name= "+ename);
	System.out.println("employee age= "+eage);
	System.out.println("employee department= "+edept);
	System.out.println("employee gender= "+egen);
	System.out.println("employee salary= "+esalary);

  }

}
public class Employee {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.input();
		e1.display();
		
		e2.input();
		e2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	private void input() {
		// TODO Auto-generated method stub
		
	}

}