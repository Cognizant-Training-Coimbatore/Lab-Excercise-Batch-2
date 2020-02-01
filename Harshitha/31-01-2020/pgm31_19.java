package Project;

import java.util.Scanner;

public class pgm31_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value for n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<5;i++)
		{
			if(a[i]==n)
				c=0;
			else
				c=1;
	    }
		if(c==0)
			System.out.println(n+" is present");
		else
			System.out.println(n+" is not present");

	}
}
