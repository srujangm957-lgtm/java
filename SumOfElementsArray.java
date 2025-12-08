package srujan;

import java.util.*;

public class SumOfElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int sum[][] = new int[2][2];
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.println("enter the value for row " + (i + 1) + " and column" + (j + 1));
				sum[i][j] = SC.nextInt();
			}

		}
		int add = 0;
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				add = add + sum[i][j];
			}
			System.out.println();
		}
		System.out.println("the total sum of array elements is " + add);

	}
}
