package Mrsabu;

import java.util.*;
public class Palindrome {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		 
		 try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a string");  
			  String original = in.nextLine();   
			  int length = original.length();   
			  char reverse = 0;
			for ( int i = length - 1; i >= 0; i-- )  
			     reverse = (char) (reverse + original.charAt(i));  
			  if (original.equals(reverse))  
			     System.out.println("Entered string");  
			  else  
			     System.out.println("Entered string/number isn't a palindrome.");
		}   
	   }      
		  
}



