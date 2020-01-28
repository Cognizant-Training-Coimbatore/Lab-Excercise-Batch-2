package demo;

import java.util.Scanner;

public class Question5_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[10];
		System.out.println("enter the names");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.next();
			
		}
		System.out.println("the names are");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i].toUpperCase());
			
		}
		

	}

}
