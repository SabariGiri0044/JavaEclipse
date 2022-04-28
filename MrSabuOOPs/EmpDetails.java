package MrSabuOOPs;

import java.util.Scanner;

class EmployeeDetails
{
	int eage;
	String ename;
	char egen;
	float esalary;


void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ename,eage,egen,esalary");
	ename=sc.next();
	eage=sc.nextInt();
	egen=sc.next().charAt(0);
	esalary=sc.nextFloat();
	sc.close();
	
	
}

void display()
{
	System.out.println("employee name= "+ename);
	System.out.println("employee age= "+eage);
	System.out.println("employee gender= "+egen);
	System.out.println("employee salary= "+esalary);

  }

}
public class EmpDetails {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Employee e1=new Employee();
		Employee e2=new Employee();
		
	//	e1.input();
	//	e1.display();
		
	//	e2.input();
		//e2.display();

	}

	
}