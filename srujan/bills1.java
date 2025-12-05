package srujan;
import java.util.Scanner;
public class bills1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total amount=");
		double amount=sc.nextDouble();
		double discount =0;
		
		if (amount>2000)
		{
			discount=amount*0.15;
			double total= amount-discount;
			System.out.println("Total amt="+amount);
			System.out.println("discount="+discount);
			System.out.println("final amt after discount="+total);}
		
		else if(amount>1000) {
				
				discount = amount*0.08;
				double total=amount-discount;
				System.out.println("Total amt="+amount);
				System.out.println("discount="+discount);
				System.out.println("final amt after discount="+total);
			}
			else {
				System.out.println("There is no discount");
			}
		}
}

		
		

	


