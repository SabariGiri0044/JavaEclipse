package MrsabuJava;
import java.io.*;

public class OddAndEven {

	//to show the given number is odd or even
		

		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number");
			int n = Integer.parseInt(br.readLine());
			String result = (n%2 == 0)?"even":"odd";
			System.out.println("The given number is " + result);
		}
	}


