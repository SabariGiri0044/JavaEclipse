
public class RemoveVowels {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s = "Computer Applications";
			String a = "";
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
						ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
					a += ch;
				}
			}
			System.out.println(a);
		}

	}
