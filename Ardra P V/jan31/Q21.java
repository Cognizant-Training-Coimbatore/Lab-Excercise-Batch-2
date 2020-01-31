package jan31;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, ins,ind, count=0;
	       int arr[] = new int[50];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       size = scan.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
	       System.out.print("Enter Element to be added : ");
	       ins = scan.nextInt();
	       System.out.print("Enter index ");
	       ind = scan.nextInt();
	       for(i=size; i>ind; i--)
	       {
	           arr[i] = arr[i-1];
	       }
		   
	       arr[ind] = ins;
	       System.out.print("\nNow the New Array is :\n");
           for(i=0; i<size; i++)
           {
               System.out.print(arr[i]+ " ");
           }
	       

	}

}
