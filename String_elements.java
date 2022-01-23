
public class String_elements {

	public static void main(String[] args) {
	
			String s="Hello World How Are You";
			s.toLowerCase();
			s.toUpperCase();
			System.out.println("Number of characters ="+s.length());
			System.out.println("Character at position of 4 "+s.charAt(3));
			//find no of vowels 
			int c=0;
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
				c++;
			}
		
		System.out.println("No of Vowels="+c);		
		}
}
