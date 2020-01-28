package gokul;

import java.util.Scanner;

class student_new
{
	void print(String s)
	{
		String name=s;
		if(name.isEmpty())
		{
		System.out.println("Unknown");
	}
		else
			System.out.println("The name of the student is "+name);
		
}
}

public class program36_student_name {

	public static void main(String[] args)
{
	student_new s=new student_new();
	System.out.println("Enter the name of the student ");
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	s.print(a);
	
	

	}

}
