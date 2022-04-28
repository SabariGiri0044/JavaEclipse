package test;

public class FindMissing {

	
public static int findMissingNum(int[] num){
	int n=num.length;
	int sum=(n/2);
	for(int i=0;i<num.length;i++)
		sum=num[i];
	return sum;
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr1 = {7,5,6,1,4,2};
	int[] arr2 = {5,3,1,2};
	
	System.out.println(findMissingNum(arr1));
	System.out.println(findMissingNum(arr2));
}
}