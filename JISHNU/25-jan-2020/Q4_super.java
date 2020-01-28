package day4;

import java.util.Scanner;

public class Q4_super {
	protected static String name[]= new String[5];
	protected static String address[]= new String[5];
	protected static String department[]= new String[5];
	protected  static int salary[]=new int[5];
	protected static void get()
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the name address department salary of employee"+(i+1));
			name[i]=sc.nextLine();
			address[i]=sc.nextLine();
			department[i]=sc.nextLine();
			salary[i]=sc1.nextInt();
		}
	}
	public static void main(String[] args) 
	{
		
		get();

	}
}
