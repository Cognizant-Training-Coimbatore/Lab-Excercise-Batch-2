package new_demo_pack;

import java.util.Scanner;

public class ex4_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		int[] a=new int[5];
		
		System.out.println("Enter 5 numbers");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();

	        }
        System.out.println("enter element to search");
             k=s.nextInt();
             
         	for(i=0;i<5;i++)
         	{		if(a[i]==k)
         		{
         			System.out.println("found");
                        break;         		} }
         	if(i==5)
         	{
         		System.out.println("not found");
         	}
         	  
}
}
