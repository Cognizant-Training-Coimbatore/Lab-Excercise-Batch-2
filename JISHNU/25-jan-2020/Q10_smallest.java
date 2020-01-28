package day4;

import java.util.Scanner;

public class Q10_smallest {
	int a[]=new int[5];
	int sm;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		sm=a[0];
	}
	
	void find()
	{
		for(int i=0;i<5;i++)
		{
			if(sm>a[i])
			{
				sm=a[i];
			}
		}
		System.out.println("smallest is "+sm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q10_smallest obj=new Q10_smallest();
		obj.get();
		obj.find();

	}

}
