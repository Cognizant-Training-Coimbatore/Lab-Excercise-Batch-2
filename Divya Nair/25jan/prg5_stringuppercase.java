package packA;

import java.util.Scanner;

public class prg5_stringuppercase 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		System.out.println("Enter the names of students: ");
		String a[]=new String[n+1];
		for(int i=0;i<=n;i++)
		{
			a[i]=sc.nextLine();
			
		}
		System.out.println("in capital letter");
		for(int i=0;i<=n;i++)
		{
			System.out.println(a[i].toUpperCase());
			
		}

	}

}
