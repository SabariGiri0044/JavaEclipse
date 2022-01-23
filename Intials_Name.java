
public class Intials_Name {

	public static void main(String[] args) {
	String s="Mahathma Karamchand Gandhi";
	
	for(int i=0;i<s.length();i++) {
		
		if(i==0) {
			System.out.println(s.charAt(i)+".");
		}
		else if(s.charAt(i)==' ') {
			System.out.println(s.charAt(i+1)+".");
		}
	}

	}

}
