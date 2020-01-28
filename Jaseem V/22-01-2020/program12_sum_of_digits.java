import java.util.Scanner;

public class program12_sum_of_digits {

	public static void main(String[] args) 
	{
		
		    long n,sum=0;
	             	    System.out.println("Enter a number ");
	                   Scanner sc = new Scanner(System.in);
	                   n = sc.nextLong();
		    while(n!=0)
		    {
			sum+=n%10;
			n/=10;
		    }
		    System.out.println("Sum of digits of a number is "+sum);
	                   	  
		}
	}

	

