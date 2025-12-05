package srujan;
import java.util.Scanner;
public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		   
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        System.out.print("Enter third number: ");
		        int c = sc.nextInt();

		        // Find smallest
		        int smallest = a;
		        if (b < smallest) smallest = b;
		        if (c < smallest) smallest = c;

		        // Find biggest
		        int biggest = a;
		        if (b > biggest) biggest = b;
		        if (c > biggest) biggest = c;

		        System.out.println("Smallest number: " + smallest);
		        System.out.println("Biggest number: " + biggest);

		        sc.close();
		    }
		

	}


