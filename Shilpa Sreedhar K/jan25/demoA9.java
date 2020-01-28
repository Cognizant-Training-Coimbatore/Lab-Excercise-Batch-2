package pack1;

import java.util.Scanner;

public class demoA9 {

	public static void main(String[] args) {
		int i, arr[],search,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		s=sc.nextInt();
		arr=new int[s];
		System.out.println("enter elements");
		for(i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter value");
		search=sc.nextInt();
		for(i=0;i<s;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("present");
				break;
			}
			
		}
	if(i==s)
	{
		System.out.println("not present");	
	}

	}

}
