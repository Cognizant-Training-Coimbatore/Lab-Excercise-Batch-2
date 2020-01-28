import java.util.Scanner;

public class exception_positive {

	
	

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		n= scan.nextInt();
		
		
			if(n>0)
			{
				System.out.println("It is a positive number");
				scan.close();
			}
			else
			{
				throw new ArithmeticException("Error");
			}
			
			
			
				
			
		
		
	}

}
