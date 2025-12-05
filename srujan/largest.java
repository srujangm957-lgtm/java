package srujan;
import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10;
		int b=100;
		int c=300;
		int d=450;
		int e=690;
		
		String data=((a>b) && (a>c) && (a>d) && (a>e)) ?a+"largest value":((b>c) && (b>d))?b+"largest value":((c>d)&&(c>e))?c+"largest value":((d>e))?d+"largest value":e+"largest value";
		System.out.println(data);

	}

}
