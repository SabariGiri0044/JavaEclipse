package JavaStrings;

public class ContainsAlp {

	public static void main(String[] args) {
		String s="buygbk";
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			//if(ch>=97 && ch<=122)
				{
				flag=true;
			}
		}if(flag==true) {
			System.out.println("Contains Alphabets");
		} else {
			System.out.println("Non Alphabets");
		}
		}
	}

	


