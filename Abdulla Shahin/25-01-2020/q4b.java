package packB;
import java.util.Scanner;

import packA.q4;
public class q4b extends q4
{
	q4b(String n,String a,String d,double s)
	{
		super(n,a,d,s);
	}
	public static void main(String[] args)
	{
		String n,a,d;
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		n= sc.nextLine();
		System.out.println("enter address");
		a= sc.nextLine();
		System.out.println("enter dept");
		d= sc.nextLine();
		System.out.println("enter salary");
		s= sc.nextDouble();

		q4b obj = new q4b(n,a,d,s);

	}

}
