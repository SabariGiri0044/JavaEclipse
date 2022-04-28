package MrsabuJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
//to find sum,average, Largest,smallest elements in an array 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of array");
				int len = sc.nextInt();
				int[] arr = new int[len];
				/*System.out.println("First array element is " + arr[0]);
			System.out.println("Second array element is " + arr[1]);
				System.out.println("Third array element is " + arr[2]);
				System.out.println("Fourth array element is " + arr[3]);
			System.out.println("Fifth array element is " + arr[4]);
			*/	System.out.println("Enter array elements");
				for(int i = 0; i < len; i++) {
					arr[i] = sc.nextInt();
				}
				int sum = 0;
				System.out.println("Array elements");
				for(int i = 0; i < len; i++) {
					System.out.println("arr[" +i+ "] = " + arr[i]);
					sum += arr[i];
				}
				System.out.println("Array Elements is reverse order");
				for(int i = len-1; i >= 0 ; i--) {
					System.out.println("arr[" +i+ "] = " + arr[i]);
				}
				float avg = (float)sum/len;
				System.out.println("Sum of array elements is " + sum);
				System.out.println("Average of array elements is " + avg);
				int max = arr[0];
				int min = arr[0];
				for(int i = 0; i < arr.length; i++) {
					if(arr[i]>max)
						max = arr[i];
					if(arr[i]<min)
						min = arr[i];
				}
				System.out.println("Largest element is " + max);
				System.out.println("Smallest element is " + min);
				sc.close();

	}

}
