import java.util.Scanner;

public class program10_odd_or_even {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		if(x%2==0)
		{
			System.out.println("The Number is even");
		}
		else
		{
			System.out.println("The Number is odd");
		}

	}

}
