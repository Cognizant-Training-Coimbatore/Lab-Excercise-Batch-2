import java.util.Scanner;

public class program12_sumdig 
{

	public static void main(String[] args)
	{
		int n,q,r,sum=0;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
			
		q=n%10;
		sum=sum+q;
		n=n/10;
		r=q+n;
		System.out.println("The value is"+r);
		
		}

	}


