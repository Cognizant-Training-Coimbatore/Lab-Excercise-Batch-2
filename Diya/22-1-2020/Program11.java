import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) 
	{	
		int rem, sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("The sum of digits is " + sum);
	}

}
