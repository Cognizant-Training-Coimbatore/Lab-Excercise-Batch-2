import java.util.Scanner;

public class example4_check 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = scanner.nextInt();
		if (num <= 0.0) 
		{
	        if (num == 0.0)
	        	System.out.println("You entered 0.");
	        else
	        	System.out.println("You entered a negative number.");
	    } 
		else
	    	System.out.println("You entered a positive number.");
	   

	}

}
