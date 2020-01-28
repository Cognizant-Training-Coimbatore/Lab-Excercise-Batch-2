package Jishnu;

import java.util.Scanner;

class Student1
{
	int roll_no;
	String phone_number;
	String address;
	String name1;
	Scanner sc=new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	void sam()
	{
		name1 = "Sam";
		System.out.println("Enter roll number of sam");
		roll_no=sc.nextInt();
		System.out.println("Enter phone number of sam");
		phone_number=sc.next();
		System.out.println("Enter address of sam");
		address = sc1.nextLine();
		System.out.println(name1);
		System.out.println("Roll number: "+roll_no);
		System.out.println("phone number: "+phone_number);
		System.out.println("address: "+address);
	}
	void john()
	{
		name1="john";
		System.out.println("Enter roll number of john");
		roll_no=sc.nextInt();
		System.out.println("Enter phone number of john");
		phone_number=sc1.nextLine();
		System.out.println("Enter address of john");
		address=sc1.nextLine();
		System.out.println(name1);
		System.out.println("Roll number"+roll_no);
		System.out.println("phone number"+phone_number);
		System.out.println("address"+address);
		
	}
	
}
public class Q2_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj=new Student1();
		
		obj.sam();
		obj.john();
	}

}
