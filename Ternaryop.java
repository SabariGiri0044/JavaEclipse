package Mrsabu;
import java.util.Scanner;
public class Ternaryop {

	public static void main(String[] args) {
		// Largest  of 3 numbers using ternary operator
       int a=10, b=20, c=30 ,d;
       Scanner sc = new Scanner(System.in);
       d = c > (a > b ? a:b) ? c : ((a>b) ? a : b);
       System.out.println("The Largest Number of all three Number is:"+d);
       
	}

}
