import java.util.Scanner;

public class pgm02_25_arrayex {

	public static void main(String[] args) 
	{
		int n,number,greater;
		System.out.println("Enter the maximum size: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int num[]=new int[n];
		greater=0;
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter number : ");
			number = sc.nextInt();
			num[i]=number;
			if(number>greater)
			{
				greater=number;
			}
		}
		System.out.println("Numbers are: ");
		for(i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Greatest number is : "+greater);
	}

}
