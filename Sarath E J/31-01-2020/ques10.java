package jan31;

import java.util.Scanner;

public class ques10 {

	public static void main(String[] args)
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int i;
			
		
		Scanner sc = new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
			
		}
		for(i=0;i<5;i++)
		{
			b[i] = sc.nextInt();
			
		}
		
			
		for(i=0;i<5;i++) 
		{
			c[i]=a[i]*b[i];
		
			System.out.println(c[i]);
		}

	}

}
