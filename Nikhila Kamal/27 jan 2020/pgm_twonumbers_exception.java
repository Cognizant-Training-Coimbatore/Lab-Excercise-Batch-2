import java.util.Scanner;

public class pgm_twonumbers_exception {
	
	

	public static void main(String[] args)
	{
		try
		{
		
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		System.out.println("enter second number");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int res=n/m;
		System.out.println("result is: " + res);
	}
	
			catch(ArithmeticException m)
			{
				System.out.println("exception occured: " + m);
			}

		}
	}


