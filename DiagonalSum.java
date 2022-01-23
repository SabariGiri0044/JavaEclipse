package MrsabuJava;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows & cols");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the elements of array ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of Array are ");
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i][i];
		}
		System.out.println("Sum of diagonal elements are: " +sum);
		sc.close();
	}

}
