import java.util.Scanner;

public class q9_25 {

	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[] {2, 1, 34, 56, 78, 90, 23, 44, 55, 31};
		 System.out.println("Enter value to find");  
		 int search=sc.nextInt();
		   
		    for (int i = 0; i < 10; i++)  
		    {  
		      if (arr[i] == search)    
		      {  
		         System.out.println("Element found");  
		         flag=1; 
		         break; 
		          
		      }  
		   }  
		   if (flag==0) 
		      System.out.println("Element not present in array");  
	}

}
