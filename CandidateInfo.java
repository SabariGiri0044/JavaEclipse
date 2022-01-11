package Mrsabu;
import java.util.Scanner;
public class CandidateInfo {

	public static void main(String[] args) {
		// input info
		Scanner sc = new Scanner(System.in);
		
		String candidatename;
		int age;
	    String qualification;
		float fees;
		
		System.out.println("Enter Your Name");
		candidatename = sc.nextLine();
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		System.out.println("Enter Your Qualification");
		qualification = sc.next();
		System.out.println("Fees(in INR");
		fees = sc.nextFloat();
	
	System.out.println("Name="+candidatename);
	System.out.println("Age="+age);
	System.out.println("Qualification="+qualification);
	System.out.println("Fees="+fees);
		
    
	}

}
