import java.util.Scanner;

public class q_10 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  int [] arr = new int [5] ;
		  System.out.println("enter the elements in the array:");
		  for(int i=0;i<5;i++)
		  {
			  arr[i] = sc.nextInt();
		  }
	      int min = arr[0];  
	      for (int i = 0; i < arr.length; i++) 
	      {  
		      if(arr[i] <min)  
		      {
		    	  min = arr[i];  
		      } 
	      }
	      System.out.println("Smallest element : " + min);  

	}

}
