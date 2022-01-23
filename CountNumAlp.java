package JavaStrings;

import java.util.Scanner;
//need to edit
public class CountNumAlp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int a=0,b=0;
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				a++;
			}else {
				if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
					b++;
			
				}
			}
			

		
        if(a==0) {
        	System.out.println("The String any numeric");
        }
        else
        {
        	System.out.println("The String have "+a+"numeric");
        }
        if(b==0) {
      
        {
        	System.out.println("The String have "+b+"alphabet");
        }
      
        }
		}
	}
}
	


