package Mrsabu;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //if else else if ladder
		
		int a=5, b=10, c=15;
		
		if(a>b) {
			System.out.println("The Largest of "+a+" and "+b+" is " +a);
		}
		else 
		{
			System.out.println("The Largest of "+a+" and "+b+" is " +b);
		}
		
		if(b>c) {
			System.out.println("The Largest of "+b+" and "+c+" is " +b);
		} else {
			System.out.println("The Largest of "+b+" and "+c+" is " +c);
		}
		if(c>a) {
			System.out.println("The Largest of "+c+" and "+a+" is " +a);
		} else {
			System.out.println("The Largest of "+c+" and "+a+" is " +c);
		}
		//int d = (a>b)?a:b;
	}

}
