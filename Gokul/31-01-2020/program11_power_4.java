import java.util.Scanner;

public class program11_power_4 {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n/4;i++)
		{
			if(Math.pow(4, i)==n)
		{
				k=1;
				System.out.println("The number is a power of 4");
		}
		}
		if(k!=1)
			System.out.println("The number is not a power of 4");
	}

}
