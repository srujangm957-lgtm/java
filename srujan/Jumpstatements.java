package srujan;
import java.util.Scanner;

public class Jumpstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length:");
		n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			System.out.println(i+" ");
			if(i==10)
				break;
			
		}
		System.out.println("this is after the loop");
		for(int i=1; i<=n;i++) {
			if(i==120)
				continue;
			System.out.println(i+" ");
		}
				

	}

}
