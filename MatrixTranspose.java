package MrsabuJava;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = sc.nextInt();
		System.out.println("Enter number of cols");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter elements of an array");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] arr1 = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr1[i][j] = arr[j][i];
			}
		}
		System.out.println("Array before transpose");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Array after transpose");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();


	}

}
