package srujan;
import java.util.Scanner;

public class Absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

       
        if (number < 0) {
            number = -number; 
        }

        System.out.println("Absolute value: " + number);
    }


	}


