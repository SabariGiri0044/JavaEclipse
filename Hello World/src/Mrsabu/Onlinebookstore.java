package Mrsabu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Onlinebookstore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*********MENU***********");
		System.out.println("WELCOME TO ONLINE BOOK STORE");
		System.out.println("SELECT THE OPTION......"); 
		System.out.println("Do You Want to BUY(B) OR SELL(S) A BOOK(S)");
		char ch=br.readLine().toUpperCase().charAt(0);
		if(ch=='S') {
			System.out.println("***WELCOME TO SELLING POINT***");
			System.out.println("Enter your Book Name");
			
		}
else if(ch=='B') {
	
}
System.out.println("****WELCOME TO BUYER SECTION****");
System.out.println("THE BOOKS AVAILABLE IN STOCK");
{
	System.out.println("Do you want to continue Y/N");
	char choice=br.readLine().charAt(0);
	
	if(choice=='N' || choice=='n') {
		System.out.println("Thanks For Shopping");
		System.out.println("Welcome Again");
	}


}
}
}