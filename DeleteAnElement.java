package MrsabuJava;

import java.util.Scanner;

public class DeleteAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Array before deletion");
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("Enter element to be deleted");
		int a = sc.nextInt();
		int x = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i] == a) {
				arr[i] = 0;
				x++;
				if(i != n-1) {
					for(;i < n-1; i++)
						arr[i] = arr[i+1];
				}
				break;
			}
		}
		if(x < 0)
			System.out.println("Element not found");
		else {
			System.out.println("Array after deletion");
			for(int i = 0; i < n-1; i++)
				System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	}


