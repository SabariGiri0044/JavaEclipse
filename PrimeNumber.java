package Mrsabu;
import java.util.*;
public class PrimeNumber {

	public static void main(String args[]) {
   
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start number :");
		int n=s.nextInt();
		System.out.println("Enter End number :");
		int m=s.nextInt();
		System.out.println("List of the Prime Number btw "+n+" and "+m+"is");
		for(int i=n;i<=m;i++)
		{
			if(isPrime(i)) {
			System.out.println(i);
		}
		}
	}

public static boolean isPrime(int n) {
	if(n<=1) {
		return false;
	}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

				
}