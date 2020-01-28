import java.util.Scanner;

public class array2 {

	public static void main(String[] args)
	{
		int n, number, greater;
		System.out.println("enter the max size:");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int num1[]= new int[n];
		int i;
		System.out.println("enter number 0");
		number = sc.nextInt();
		num1[0]= number;
		greater = number;
		for(i=1;i<n;i++)
		{
			System.out.println("enter number "+i);
			number = sc.nextInt();
			num1[i]= number;
			if(number > greater)
			{
				greater  = number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("numbers are "+ num1[i]);
			
		}
		System.out.println("greatest number "+greater);
	}

}
