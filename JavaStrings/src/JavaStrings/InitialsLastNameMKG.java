package JavaStrings;

import java.util.Scanner;

public class InitialsLastNameMKG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine().trim();
		s = s.toUpperCase();
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ')
				c++;
		}
		int x = 0;
		for(int i = 0; i < s.length(); i++) {
			if(i == 0)
				System.out.print(s.charAt(i) + ". ");
			if(s.charAt(i) == ' ') {
				if(x < c-1)
					System.out.print(s.charAt(i+1) + ". ");
				else if(x == c-1) {
					System.out.print(s.substring(i+1));
					break;
				}
				x++;
			}
			
		}
		
		sc.close();
	}

}
