package MrsabuJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) 
			if(n % i == 0) {
				System.out.println("The factors of " +n+ " are " +i);
				sum += i;
			}
		System.out.println("The sum of all the factors is " +sum);
		sc.close();
	}

}
