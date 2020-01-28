package set4;

import java.util.Scanner;

public class qn8_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,temp=0,j;
		Scanner sc=new Scanner(System.in);
		int inputArray[]=new int[5];
		
		System.out.println("Enter 5 inputs");
		for(i=0;i<5;i++)
		{
		inputArray[i]=sc.nextInt();
		}
		System.out.println("Printing in descending order");
		for(i=0;i<5;i++)
		{
		for (j = i + 1; j < 5; j++) 
		{
		if(inputArray[i]<inputArray[j])
		{

		temp=inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]=temp;
		}
		}
		}
		for(i=0;i<5;i++)
		{
		System.out.println(inputArray[i]);
		}
		System.out.println("Printing in ascending order");
		for(i=0;i<5;i++)
		{
		for (j = i + 1; j < 5; j++) 
		{
		if(inputArray[i]>inputArray[j])
		{

		temp=inputArray[i];
		inputArray[i]=inputArray[j];
		inputArray[j]=temp;
		}
		}
		}
		for(i=0;i<5;i++)
		{
		System.out.println(inputArray[i]);
		}

	}

}
