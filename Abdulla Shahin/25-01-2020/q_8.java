import java.util.Scanner;

public class q_8 {

	public static void main(String[] args) 
	{
		int n,i,j,temp;
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		System.out.println("enter the nos:");
		for ( i=0;i<5;i++)
		{
			n = sc.nextInt();
			num[i] = n;
		}
		for ( i = 0; i < num.length; i++) 
		{     
	        for ( j = i+1; j < num.length; j++)
	        {     
	              if(num[i] > num[j])
	              {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	              }     
	         }     
	    }  
		System.out.println("ascending order: ");   
	    for ( i = 0; i < num.length; i++)
	    {     
	         System.out.print(num[i] + " ");    
	    }  
	    System.out.println("");
	    
	    for ( i = 0; i < num.length; i++) 
		{     
	        for ( j = i+1; j < num.length; j++)
	        {     
	              if(num[i] < num[j])
	              {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;    
	              }     
	         }     
	    }  
		System.out.println("descending order: ");    
	    for ( i = 0; i < num.length; i++)
	    {     
	         System.out.print(num[i] + " ");    
	    }
	}

}
