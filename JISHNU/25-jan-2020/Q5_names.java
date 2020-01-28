package day4;

import java.util.Scanner;

public class Q5_names {
	String name[]=new String[5];
	Scanner sc=new Scanner(System.in);
	void get()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name "+(i+1));
			name[i]=sc.nextLine();
		}
	}
	void out()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("name "+(i+1)+ " "+name[i].toUpperCase());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5_names obj=new Q5_names();
		obj.get();
		obj.out();
	}

}
