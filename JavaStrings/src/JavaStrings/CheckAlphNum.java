package JavaStrings;

public class CheckAlphNum {

	public static void main(String[] args) {
		String s="hgj";
		
		/*//for(int i=65;i<=90;i++) {
		//for(int i=0;i<=9;i++) {
			for(int i=97;i<=122;i++) {
			char ch=(char)i;
			System.out.println("Ascii="+i+ "char="+ch);
		}*/
		
		boolean flag=false;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='0' && ch<='9') {
			flag=true;
		}
	}if(flag==true) {
		System.out.println("Contains Digits");
	} else {
		System.out.println("Non Digits");
	}
	}
}
		
	
	


