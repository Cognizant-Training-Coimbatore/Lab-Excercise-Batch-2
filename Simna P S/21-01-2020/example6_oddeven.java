import java.util.Scanner;

public class example6_oddeven 
{

	public static void main(String[] args)
	{
		
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = scanner.nextInt();
		if (num %2==0.0) 
		{
	       
	        	System.out.println("You entered an even number.");
	    } 
		else
	    	System.out.println("You entered an odd number.");
	}

}
