import java.util.Scanner;

public class question20 {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in);
		int n= input.nextInt();
		int a [] = new int [n];
		System.out.println("Enter elements :");
		for (int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Elements before replacing");
		for (int i=0;i<n;i++)
		{
			System.out.print(" " +a[i]);
		}
		System.out.println("Enter position to be replaced");
		int replace = input.nextInt();
		for(int i=n-1; i>replace-1;i--)
			a[i]=a[i-1];
		System.out.println("After replacing :");
		for (int i=0;i<n;i++)
		{
			System.out.print(" " +a[i]);
		}
		
	}

}
