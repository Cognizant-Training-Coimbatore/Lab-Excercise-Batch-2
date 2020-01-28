import java.util.Scanner;

public class prog12_sum_of_digit {

	public static void main(String[] args)
	{
		int a,sum=0,b;
	
		
	System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		
		while(a>0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println("The sum of digit is "+sum);
		// TODO Auto-generated method stub

	}

}
