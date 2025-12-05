package srujan;

import java.util.Scanner;

public class PrintTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time between 1 to 24");
		int time = scan.nextInt();
		System.out.println(PrintTime.printTime(time));
	}
	
	public static String printTime(int time) {
		
		if(time >= 1&& time <=12)
			return "am";
		else if(time > 12 && time <=24)
			return "pm";
		else
			return "invalid input";
			
				
		
		

	}

}
