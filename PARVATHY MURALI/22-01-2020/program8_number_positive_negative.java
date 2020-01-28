import java.util.Scanner;

public class program8_number_positive_negative
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println(number+" is a positive number");
		}
		else if(number==0)
		{
			System.out.println(number+" is neither a positive nor a negative number ");
		}
		else
		{
			System.out.println(number+" is a negative number");
		}
		

	}

}
