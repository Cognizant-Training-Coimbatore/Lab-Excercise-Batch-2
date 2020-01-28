package demo;

import java.util.Scanner;

class Students
{
	String name,address,ph_no;
	int roll_no;
	void assign()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll No : ");
		roll_no=sc.nextInt();
		System.out.println("Phone number : ");
		ph_no=sc.next();
		System.out.println("Address : ");
		address=sc.next();
		
	}
	void display()
	{
		System.out.print("\n Name:"+name+"\n Roll Number : "+roll_no+"\n Phone Number : "+ph_no+"\n Address :"+address+"\n");
	}
	 
}
public class program22b_class_assign_and_print 
{

	public static void main(String[] args)
	{
		Students ob1=new Students();
		Students ob2=new Students();
		ob1.name="Sam";
		ob2.name="John";
		System.out.println("Enter the Details of Sam:");
		ob1.assign();
		System.out.println("Enter the Details of John:");
		ob2.assign();
		System.out.println("\n Student Details:");
		ob1.display();
		ob2.display();
	}
}
