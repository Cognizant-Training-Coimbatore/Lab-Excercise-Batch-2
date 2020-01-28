package classworkA;

import java.util.Scanner;

public class question4_Employee_details 
{
	public static  Scanner sc=new Scanner(System.in);
	public static String name[]=new String[5];
	public static String address[]=new String[5];
	public static String department[]=new String[5];
	public static int salary[]=new int[5];
	public static String s[]=new String[5];
	public void initialize()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter name of the employee");
		 name[i]=sc.next();
		System.out.println("Enter address of the Employee");
		address[i]=sc.next();
		System.out.println("Enter the department of the Employee");
		department[i]=sc.next();
		System.out.println("Enter the salary of the Employee");
		salary[i]=sc.nextInt();
		System.out.println("Enter specialization of the Employee");
		s[i]=sc.next();
		
	}
	}
	public void print()
	{
		System.out.println("Employee details");
		int c=1;
		for (int i = 0; i <5; i++) 
		{
			System.out.println("Employee "+c+ "Details "+"Name:"+name[i]);
			System.out.println("Address: "+address[i]);
			System.out.println("Department: "+department[i]);
			System.out.println("Salary: "+salary[i]);
			System.out.println("Specialization "+s[i]);
			
			c++;
			System.out.println();
					
	}
	
	

}
}
