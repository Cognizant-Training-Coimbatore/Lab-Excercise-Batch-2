package packageA;

import java.util.Scanner;

public class class_four 
{
	static String name,address,dep;
	static int sal;
	public static void main(String[] args)
	{
		System.out.println("enter the details");
		Scanner sc =new Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		dep=sc.nextLine();
		sal=sc.nextInt();
	}
}
