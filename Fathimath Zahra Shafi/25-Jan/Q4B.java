package packTwo;
import java.util.Scanner;

import packOne.Q4A;
public class Q4B extends Q4A {
	
	
	Q4B(String n,String a,String d,double s)
	{
		super(n,a,d,s);
	}
	
	
	public static void main(String[] args)
	{
		String n,a,d;
		double s;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter name: ");
		n=scanner.nextLine();
		System.out.println("enter address: ");
		a=scanner.nextLine();
		System.out.println("enter department: ");
		d=scanner.nextLine();
		System.out.println("enter salary: ");
		s=scanner.nextDouble();	
		
		Q4B obj=new Q4B(n,a,d,s);
		
		
	}

}
