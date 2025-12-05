package srujan;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a year");
		int year= sc.nextInt();
		
		if((year % 4)==0)
		    {
		
			System.out.println("leap year");
			}
		    else 
		{
			System.out.println("not a leap year");
		}

	}

}
