package set4;

import java.util.Scanner;

public class qn_9_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num, item, array[];
	    
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of elements:");
	     num = sc.nextInt(); 
	     array = new int[num]; 
	     System.out.println("Enter " + num + " integers");
	     
	     for (i = 0; i < num; i++)
	     {
	       array[i] = sc.nextInt();
	     }  
	     System.out.println("Enter the no. to be searched:");
	     item = sc.nextInt();

	     for (i = 0; i < num; i++)
	     {
	        if (array[i] == item) 
	        {
	          System.out.println(item+" is present at location "+(i+1));
	         break;
	        }
	           }
	    if(i==num)
	    {
	       System.out.println(item + " The doesn't exist in array.");
	    }
	}

}
