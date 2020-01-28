package pack1;

import java.util.Scanner;

public class demoA5 {
	
	public static void main(String[] args) {
		int i;
		
		String st[]=new String[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 names :");
		for( i=0;i<5;i++)
		{
			st[i]=sc.nextLine();
			
		}
		for(i=0;i<5;i++)
		{
			System.out.println(st[i].toUpperCase());
		}
		
		

	}

}
