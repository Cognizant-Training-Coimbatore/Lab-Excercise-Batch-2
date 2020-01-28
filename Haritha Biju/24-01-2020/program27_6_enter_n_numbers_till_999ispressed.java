package demo;

import java.util.Scanner;

/*Input N numbers from the user till he presses -999 and 
 * display the sum and average
 */
public class program27_6_enter_n_numbers_till_999ispressed 
{ 
	public static void main(String[] args)
	{
		int n,sum=0,count=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number: ");
		n=sc.nextInt();
		while(n!=-999)
		{	count++;
			sum+=n;
			System.out.println(" Enter a number: ");
			n=sc.nextInt();
		}
		avg=sum/count;
		System.out.println("Sum of the numbers : "+sum+"\nAverage of the numbers : "+avg);
		
	}

}
