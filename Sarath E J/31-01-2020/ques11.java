package jan31;

import java.util.Scanner;

public class ques11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int i=1;i<=n/4;i++)
		{
			if(Math.pow(4, i)==n)
			{	
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("The no is power of 4");
		}
		else
		{
			System.out.println("The no is not");
		}
			
		

	}

}
