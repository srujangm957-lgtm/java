package srujan;
import java.util.*;
public class TwoDimArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//declare a two dim array and defining a two dim array
		int arr[][]=new int[2][3];
		
		//initialize the values to the array
		for (int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the value for row " +(i+1)+" and column"+(j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		//printing the values to the array
		for (int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

	}

	}
}
