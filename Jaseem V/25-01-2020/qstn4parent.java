package pack1;

import java.util.Scanner;

public class qstn4parent {
	public String name,address,department;
	public double salary;
	
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the name :");
		name=sc.nextLine();
		System.out.println("Enter the address :");
		address=sc.nextLine();
		System.out.println("Enter the department :");
		department=sc.nextLine();
		System.out.println("Enter the salary :");
		salary=sc.nextDouble();
	}
	public void printdetails()
	{
		
		System.out.println("name :"+name);
		
		System.out.println("address :"+address);
		
		System.out.println("department :"+department);
		
		System.out.println("salary :"+salary);
		
	}
	

}
