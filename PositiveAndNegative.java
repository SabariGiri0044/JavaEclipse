package MrsabuJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveAndNegative {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n = Integer.parseInt(br.readLine());
		String result = (n>0)?"positive":"negative";
		System.out.println("The given number is " + result);
	}

}
