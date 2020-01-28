import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args)
	{
		int rem=0,ans=0;
		System.out.println("enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			rem=num%10;
			ans=ans+rem;
			num=num/10;
		}
		System.out.println(ans);
		
	}

}
