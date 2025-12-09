package oopsconcepts;
import java.util.Scanner;

public class Student {
	int id;
	String firstname;
	String lastname;
	double fees;

	
	public Student(int id,String firstname,String lastname, double fees) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.fees=fees;
	}
	
	public void getName() {
		System.out.println("the firstname is :" +firstname);
		System.out.println("the lastname is :" +lastname);
	}
		
	public void getFees() {
		System.out.println("the fees is " +fees);
	}
	
	public static void main (String args[]) {
		
	Student std= new Student(10, "Srujan", "GM" , 200000.0);
	System.out.println ("Student id is:" +std.id);
	std.getName();
	std.getFees();
	
	
	Student std1= new Student(11, "raj", "kumar" , 200000.1);
	System.out.println ("Student id is:" +std1.id);
	std1.getName();
	std1.getFees();
	
	Student std2= new Student(12, "virat", "kohli" , 300000.1);
	System.out.println ("Student id is:" +std2.id);
	std2.getName();
	std2.getFees();
	
	
	}
}
		
		

