import java.util.Scanner;

public class program11_maths
{

	public static void main(String[] args)
	{
		int a,b;
		double c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the vaue of a:");
		a=scan.nextInt();
		System.out.println("\nEnetr the vaue of b:");
		b=scan.nextInt();
		c=Math.pow(a, 2)+(2*a*b)+Math.pow(b,2);
		System.out.println("\nThe value of the eqation is:"+c);
	
	
	
	}

}
