package demo;

import java.util.Scanner;

public class program_Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,d,s=0,avg,c=999,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			d=sc.nextInt();
			//count++;
			if(d==c)
			{
				break;
			}
			s=s+d;
			count++;
			
		}
		avg=s/count;
		System.out.println(s);
		System.out.println(avg);
		
		

	}

}
