package ExceptionHandling;

import java.util.Scanner;

class MyCustomException extends Exception{
	MyCustomException(String s){
		super(s);//Exception class
	}
}
class Age1{
	final int age=18;
	 void checkAge(int a) throws MyCustomException {
		 if(a<this.age) {
			 throw new MyCustomException("Not Eligible");
		 }
	 }
}
public class ThrowDemo1 {

	public static void main(String[] args) throws MyCustomException {
	     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		Age1 ob = new Age1();
		ob.checkAge(age);
	}
}
