package jan31;

import java.util.Scanner;

public class ques19 {

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int temp,flag=0;
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the element to be found : ");
		temp = sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i]==temp)
			{
				flag =1;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Sorry");
		}

	}

}
