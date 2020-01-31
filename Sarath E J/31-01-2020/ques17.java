package jan31;

import java.util.Scanner;

public class ques17 {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = " ";
		for(int i=1;i<=n;i++)
		{	
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(str);
			}
			for(int j=i;j>=1;j--)
			{	
				
				System.out.print((char)(j+64));
			}
			for(int j=2;j<=i;j++)
				System.out.print((char)(j+64));
			System.out.println("");
		
			
		}
		for(int i=n;i>=1;i--)
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(str);
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64));
			}
			for(int j=2;j<=i;j++)
				System.out.print((char)(j+64));
			System.out.println("");
		}
	}

}
