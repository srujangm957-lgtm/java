package srujan;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		int age = scan.nextInt();
		boolean value = Method.canVote(age);
		if(value)
			System.out.println("can vote");
		else
			System.out.println("cannot vote");
		
	}
	public static boolean canVote(int age) {
		if(age >18) { 
			return true;
		}
		else {
			return false;
		}
		

	}

}
