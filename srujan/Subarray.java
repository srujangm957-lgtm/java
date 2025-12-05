package srujan;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {10,20,30,40,50,60,70};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start index:");
		int n=sc.nextInt();
		
		System.out.println("Enter end index:");
		int m=sc.nextInt();
		
		Subarray.subArray(arr,n,m);
	}
	
	public static void subArray(int arr[], int n, int m) {
		for (int i=n; i<m;i++) {
			System.out.println(arr[i]);
		}
				
	
		
		

	}

}
