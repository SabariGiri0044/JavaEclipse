import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		
		String unname="Sabarigiri";
		String uppass="Mrsabu123";
		
		String un,up;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You Have 3 Attemps only to Login");
		System.out.println("Enter User Name");
		un=sc.next();
		System.out.println("Enter your Password");
		up=sc.next();
	
		int i;
		for(i=0;i<3;i++) {
	if(un.equalsIgnoreCase(unname) && up.equals(uppass)) {
		System.out.println("Login Successfull");
		break;
	}
	else {
		System.out.println("Invalid User");
		System.out.println((3-1-i) + " attempts left");
	}
	
	if(i<2) {
		System.out.println("Enter username");
		unname = sc.next();
		System.out.println("Enter password");
		uppass = sc.next();
	}
if(i>=3) 
{
	System.out.println("Please try again after 24 hours");
		
	}
}
}
}