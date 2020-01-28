package day5;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Q8 {

	static void validate()throws myexceptions
	{
		String name,address,aadhar;
		
		FileOutputStream fout;
		PrintStream p;
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter your address");
		address=sc.nextLine();
		System.out.println("Enter aadhar number");
		aadhar=sc.nextLine();
		System.out.println("Do you want to save if yes enter 1 else 0");
		number=sc.nextInt();
		if(number!=0 && number!=1)
		throw new myexceptions("Invalid Choice");
		else if(number==1)
		{
			try
		{
			fout=new FileOutputStream("E:\\Myfile2.txt");
			p=new PrintStream(fout);
			p.println(name);
			p.println(address);
			p.println(aadhar);
			System.out.println("Record saved...exiting....");
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
		}
		else if(number==0)
		{
			System.out.println("Record not saved...and exiting");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate();
		}
		catch(Exception m) 
		{
			System.out.println("Exception occured: "+m);
		}
	}

}
