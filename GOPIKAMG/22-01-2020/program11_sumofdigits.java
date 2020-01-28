import java.util.Scanner;
public class program11_sumofdigits
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int sum=0;
		while(m>0)
		{
		int n=m%10;
		sum=sum+n;
		m=m/10;
		}
		
 System.out.println("The sum is:" +sum);
	}

}
