package packB;
import java.util.Scanner;

import packA.pgm_4;
public class pgm_d extends pgm_4 
{
	pgm_d(String n,String a,String d,double s)
	{
		super(n,a,d,s);
	}

	public static void main(String[] args)
	{
		String n,a,d;
		double s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		n=sc.nextLine();
		System.out.println("enter address");
		a=sc.nextLine();
		System.out.println("enter department");
		d=sc.nextLine();
		System.out.println("enter salary");
		s=sc.nextDouble();
		pgm_d obj=new pgm_d(n,a,d,s);
		

	}

}
