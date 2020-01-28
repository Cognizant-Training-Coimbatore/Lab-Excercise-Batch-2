import java.util.Scanner;

public class program8_positive
{

	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the value of n");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n>0)
			System.out.println("Given number " +n+ " is positive");
		else if(n<0)
			System.out.println("Given number " +n+ " is negative");
		else
			System.out.println("Given number " +n+ " is neither positive nor negative");
		
		// TODO Auto-generated method stub

	}

}
