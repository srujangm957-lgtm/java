package srujan;

import java.util.Scanner;

public class Return6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number A");
		int a= sc.nextInt();
		System.out.println("enter number B");
		int b= sc.nextInt();
		boolean result=(a==6)|| (b==6) || (a+b)==6 || (a-b)==6;
		System.out.println("result is" + result);
		
		

	}

}
