
public class FindVowels {

	public static void main(String[] args) {
		String s = "Hello how are you";
		s.toLowerCase();
		int c = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u')
				c++;
		}
		System.out.println("Total number of vowels: " +c);

	}

}
