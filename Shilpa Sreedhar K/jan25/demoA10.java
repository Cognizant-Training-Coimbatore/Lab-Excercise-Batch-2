package pack1;

import java.util.Scanner;

public class demoA10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,arr[],j,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		System.out.println("smallest is: " +arr[0]);
	}

}
