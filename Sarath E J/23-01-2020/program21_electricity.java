import java.util.Scanner;

public class program21_electricity {

	public static void main(String[] args)
	{
		int n,m,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the new meter reading");
		m=sc.nextInt();
		System.out.println("Enter the old meter reading");
		n=sc.nextInt();
		c=m-n;
		System.out.println("No of units are :"+c);
		
		System.out.println("price=");
		if(c>=1 && c<=100)
		{
			System.out.println("FREE");
		}
		
		else if(c>=101 && c<=200)
		{
			System.out.println(1*c);
		}
		else if(c>=201 && c<=300)
		{
			System.out.println(2*c);
		}
		else if(c>=301 && c<=400)
		{
			System.out.println(3*c);
		}
		else  
		{
			int amount=c*4;
			System.out.println(amount+amount*0.1);
		}
		
	}

}

