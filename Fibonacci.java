package Mrsabu;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0,b=1,c=2,i;
				int j=10;
		System.out.println(a+" "+b);
		for(i=2;i<j;++i)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}

	}

}
