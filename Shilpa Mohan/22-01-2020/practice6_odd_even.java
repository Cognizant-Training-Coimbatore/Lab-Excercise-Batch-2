import java.util.Scanner;

public class practice6_odd_even {

	public static void main(String[] args) 
	{
		int a = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");	
		}
		else
		{
			System.out.println("The number is odd");
		}
	}

}
