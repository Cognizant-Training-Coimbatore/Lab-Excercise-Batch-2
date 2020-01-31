package jan31;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result="";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers for first array");
		int array1[]= new int[5];
		for(int i=0; i<5;i++)
		{
			array1[i]=input.nextInt();
			
		}
		System.out.println("Enter 5 numbers for second array");
		int array2[]= new int[5];
		for(int i=0; i<5;i++)
		{
			array2[i]=input.nextInt();
			
		}
		
		for(int i=0;i<array1.length;i++)
		{
			int mul1=array1[i];
			int mul2=array2[i];
			result=result+Integer.toString(mul1*mul2)+" ";
			
			
			
		}
		System.out.println("product of corresponding elements are: " +result);
	}

}
