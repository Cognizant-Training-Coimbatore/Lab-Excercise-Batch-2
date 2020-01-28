import java.util.Scanner;

public class program13_electricitybill 
{

	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter the old meter reading");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Enter the new meter reading");
		Scanner scanner2 = new Scanner(System.in);
		b = scanner2.nextInt();
		c=b-a;
		if(c>=1 && c<=100)
		{
			System.out.println("The price is free");
			
		}
		
		else if(c>=101 && c<=200)
		{
			System.out.println("The price is free:" + 1*c);
		}
		else if(c>=201 && c<=300)
		{
			System.out.println("The price is free:" + 2*c);
		}
		else if(c>=301 && c<=400)
		{
			System.out.println("The price is free:" + 3*c);
		}
		else
		{
			System.out.println("The price is free:"+ ( 4+4*0.10)*c);
		}
		

		

		

		
		// TODO Auto-generated method stub

	}

}
