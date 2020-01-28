import java.util.Scanner;

public class q10_25 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			number=sc.nextInt();
			arr[i]=number;
		}
	        int min = arr[0];  
	        for (int i = 0; i < arr.length; i++)
	        {   
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	
		}
	

}
