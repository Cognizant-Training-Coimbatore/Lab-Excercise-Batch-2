import java.util.Scanner;

public class program22_odd_count {

	public static void main(String[] args) 
	{
		int a,b,c,d,e,count=0;
		System.out.println("enter the first numbers");
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		System.out.println("enter the second numbers");
		b=scanner.nextInt();
		System.out.println("enter the third numbers");
		c=scanner.nextInt();
		System.out.println("enter the fourth numbers");
		d=scanner.nextInt();
		System.out.println("enter the fifth numbers");
		e=scanner.nextInt();
		if(a%2!=0)
		{
			count++;
		}
		if(b%2!=0)
		{
			count++;
		}
		if(c%2!=0)
		{
			count++;
		}
		if(d%2!=0)
		{
			count++;
		}
		if(e%2!=0)
		{
			count++;
		}
		
		System.out.println("no of odd numbers is"+count);
	}

}
