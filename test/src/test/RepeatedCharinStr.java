package test;

import java.util.HashSet;

public class RepeatedCharinStr {

	public static char Repeating1(char str[]) {
		HashSet<Character> h = new HashSet<>();
		for(int i=0;i<=str.length-1;i++) {
			char c = str[i];
			if(h.contains(c))
				return c;
			else
				h.add(c);
		}
		return '\0';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi, Hello, How Are You";
		char[] arr = str.toCharArray();
		System.out.println(Repeating1(arr));
	}

}
