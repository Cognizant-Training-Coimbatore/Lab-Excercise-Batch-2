import java.util.Scanner;

public class j25_q10_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int arr[]= new int[5];
    System.out.println("Enter 5 elements in an array");
    for(int i=0;i<5;i++)
    {
    	arr[i] = sc.nextInt();
    }
    int min= arr[0];
    for(int i=0;i<5;i++) 
    {
    	if(arr[i]<min)
    	{
    		min =arr[i];
    	}
    }
    System.out.println("The smallest number in the given array is : "+min);
    
	}

}
