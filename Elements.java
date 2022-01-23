package MrsabuJava;

import java.util.Scanner;

public class Elements {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter an Array Size");
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter an Array Element :" +n);
		//getting
		for(int i=0; i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		//displaying
		for(int i=0;i<array.length;i++) {
			System.out.println("The Array Element"+array[i]);
		}
	}
}

