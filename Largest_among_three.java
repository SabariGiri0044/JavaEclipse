
import java.util.*;

public class Largest_among_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int largest = (a>b)?((a>c)?a:c):(b>c)?b:c;
		System.out.println("The largest number is: " + largest);
		sc.close();
	}
}
