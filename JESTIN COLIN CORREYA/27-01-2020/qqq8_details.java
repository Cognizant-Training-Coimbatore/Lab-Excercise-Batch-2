package demo;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class qqq8_details {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name=sc.next();
		System.out.print("Enter the Address: ");
		String address=sc.next();
		System.out.print("Enter the Aadhar card number:  ");
		String aadhar=sc.next();
		System.out.print("Save - 1\n Do not save - 0\nEnter your choice\t:\t");
		int c=sc.nextInt();
		try {
		if (c==0)
			System.out.println("Record not saved exiting");
		else if(c==1)
		{
			try {
			FileOutputStream fout;
			PrintStream p;
				fout= new FileOutputStream("D:\\myfile1.txt");
				p=new PrintStream(fout);
				p.println("Name: "+name);
				p.println("Address: "+address);
				p.println("Aadhar card Number: "+aadhar);
				System.out.println("Record saved exiting");
				
		}
			catch(Exception e)
			{
				System.err.println(e);
			}
			finally {
				System.out.println("file ops");
			}
		}
		else
			throw new Exception();
	}
		catch(Exception e)
		{
			System.out.println("Invalid input choice");
		}
	}
}