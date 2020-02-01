package jan31;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
		   int size, i, a,b;
	       int arr[] = new int[50];
	       Scanner sc = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       size = sc.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = sc.nextInt();
	       }
	       System.out.print("Enter Element to be added : ");
	       a = sc.nextInt();
	       System.out.print("Enter index ");
	       b = sc.nextInt();
	       for(i=size; i>b; i--)
	       {
	           arr[i] = arr[i-1];
	       }
		   
	       arr[b] = a;
	       System.out.print("\nNow the New Array is :\n");
        for(i=0; i<size; i++)
        {
            System.out.print(arr[i]+ " ");
        }
	       

	}

}
