import java.util.Scanner;

public class j31_q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		if(isPowerOfFour(n))
			{
			  System.out.println("The given number is power of 4");
			}
		else
		{
			System.out.println("The given number is not the power of 4");
		}

	}
	public static boolean isPowerOfFour(int n)
	{
		
		if(n==0)
		{
			return false;
		}
		while(n!=1)
		{
			if(n%4!=4)
			{
				return false;		
			}n= n/4;	
		}return true;
		
	}

}
