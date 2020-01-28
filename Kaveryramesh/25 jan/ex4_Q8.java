package new_demo_pack;

import java.util.Scanner;

public class ex4_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,t;
		int[] a=new int[5];
		
		System.out.println("Enter 5 numbers");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();

	      }
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5-i-1;j++)
			{
				if(a[j]>a[j+1])
                     {
					      t=a[j+1];
					      a[j+1]=a[j];
					      a[j]=t;
					
					}
			}
		}
		System.out.println("Ascending order");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		for(i=0;i<5;i++)
		   {
			   for(j=0;j<5-i-1;j++)
		       {
			         if(a[j+1]>a[j])
                    {
				      t=a[j+1];
				      a[j+1]=a[j];
				      a[j]=t;
				
				
                   }
		  }
			   
	}
		System.out.println("descending order");
	for(i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	
		

	}

}
