package new_demo_pack;

import java.util.Scanner;

public class ex4_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] a=new int[5];
		int[] b=new int[5];
		System.out.println("Enter 5 numbers");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();

	      }
		for(i=0;i<5;i++)
		{
			
		      b[i]=a[i];
		
		    }
		System.out.println("contents in next array : ");
		for(i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		
		}

}
