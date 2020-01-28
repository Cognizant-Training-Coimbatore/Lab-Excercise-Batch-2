package packB;

import java.util.Scanner;

public class ques9 {

	public static void main(String[] args)
	{
		int[] a = new int[11];
		int temp,flag=0;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array : ");
		for( i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched for : ");
		temp = sc.nextInt();
		for( i=0;i<10;i++)
		{
			if(a[i]==temp)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element "+temp+" is present at position "+(i+1));
		}
		else
		{
			System.out.println("Sorry Wrong Entry");
		}
		

	}

}
