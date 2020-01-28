package day3;

import java.util.Scanner;

class T
	{
		int num[]= new int[1000];
		int a=0,sum=0,avg=0,i=0;
		Scanner sc=new Scanner(System.in);
		void call()
		{
			if(i!=-1)
		{
			System.out.println("enter number");
			a=sc.nextInt();
			if(a!=-999)
			{
				num[i]=a;
				i++;
			}
			else
			{
				for(int j=0;j<=i;j++)
					sum=sum+num[j];
					avg=sum/(i);
				System.out.println("Sum :"+sum);
				System.out.println("Avg :"+avg);
				
				i=-1;
			}
		}
		}
		
	}
public class Q6_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T obj=new T();
		while(obj.a!=-1)
		{
			obj.call();
		}
		
		
	}

}
