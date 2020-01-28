package packB;

import java.util.Scanner;

public class ques8 {

	public static void main(String[] args)
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i = 0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			
		}		
		int temp;
		
		for(int i = 0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		System.out.println(" Array in descending order: ");
		for(int j =0;j<5;j++)
		{
			System.out.println(+arr[j]);
		}
		
		System.out.println("Array in ascending  order: ");
		
		for(int j=4;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
		
		

}


