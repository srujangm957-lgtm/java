package oopsconcepts;

import java.util.Scanner;

class Student123{		
		int id;
		String name;
		double fees;
		
		public Student123(int id, String name, double fees) {
			//super();
			this.id = id;
			this.name = name;
			this.fees = fees;
		}
		
	public void getName() {
			System.out.println("The name is "+name);
		}
		
		public void getfees() {
			System.out.println("The salary is "+fees);
		}
		
	}


public class StudentArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// created student array and defined the size as 4
		Student123 students[] = new Student123[4];

		Scanner scan = new Scanner(System.in);
		
		//input loop
		for (int i = 0; i < students.length; i++) {
			int localid;
			String localname;
			double localfees;
		
			System.out.println("Enter the details of " + (i + 1) + " student ");
			System.out.println("Enter student " + (i + 1) + " id");
			localid = scan.nextInt();
			System.out.println("Enter student " + (i + 1) + " name");
			localname = scan.next();
			System.out.println("Enter student " + (i + 1) + " fees");
			localfees = scan.nextDouble();

			students[i] =new Student123(localid, localname, localfees);
		}
//		System.out.println(studOne.id);
//		System.out.println(studOne.name);
//		System.out.println(studOne.salary);

		//output loop
		for (int i = 0; i < students.length; i++) {
			System.out.println("The id is " + students[i].id);
			System.out.println("The name is " + students[i].name);
			System.out.println("The id fees is " + students[i].fees);
            
		}
		scan.close();
	}

}
