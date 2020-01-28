import java.util.Scanner;

public class pgm19_countodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("enter a:");
		a = s.nextInt();
		System.out.print("enter b:");
		b = s.nextInt();
		System.out.print("enter c:");
		c = s.nextInt();
		System.out.print("enter d:");
		d = s.nextInt();
		System.out.print("enter e:");
		e = s.nextInt();
		if(!(a%2==0))
		{
			count++;
		}
		if(!(b%2==0))
		{
			count++;
		}
		if(!(c%2==0))
		{
			count++;
		}
		if(!(d%2==0))
		{
			count++;
		}
		if(!(e%2==0))
		{
			count++;
		}
		System.out.print("number of odd numbers:" +count);
		
	}

}
