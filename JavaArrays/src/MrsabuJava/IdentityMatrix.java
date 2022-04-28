package MrsabuJava;

import java.io.*;

public class IdentityMatrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows & cols");
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		System.out.println("Enter the elements of array ");
		for(int i = 0; i < n; i++) {
			String a[] = br.readLine().split(" ");
			for(int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(a[j]);
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		int c = 0;
		outer:
		for(int i = 0; i < n; i++) {
			inner:
			for(int j = 0; j < n; j++) {
				if(i != j && arr[i][j] != 0) {
					c=1;
					break outer;
				}
				else if(i == j && arr[i][j] != 1) {
					c=1;
					break outer;
				}	
			}
		}
		if(c==1)
			System.out.println("Not a Identity Matrix");
		else
			System.out.println("Identity Matrix");
	}

}
