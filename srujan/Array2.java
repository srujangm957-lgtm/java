package srujan;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Array elements are:");
		        for (int i = 0; i < n; i++) {
		            System.out.println("Element " + (i + 1) + ": " + arr[i]);
		        }

		        sc.close();
		    }
		}