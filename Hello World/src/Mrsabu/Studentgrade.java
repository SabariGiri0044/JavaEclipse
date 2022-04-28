package Mrsabu;
import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
		// student grade system using ladder else

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mark");
		
		int mark= sc.nextInt();
		{
		if(mark > 90) {
			
			System.out.println("Grade of the Student is A");
		} else
		{
		
		if(mark > 60) {
			
			System.out.println("Grade of the Student is B");
			
		}else
		{
		
		if(mark > 0) 
		{
				System.out.println("Grade of the Student is C");
			} 
		else		
			{
			System.out.println("Grade of the Student is INVALID");
			}
		}
		}
		}
	}
}

	
