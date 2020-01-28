import java.util.Scanner;

public class prog10_odd_even
{

	public static void main(String[] args)
	{   
		int x;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		if(x==0)
		{
			System.out.println(x+" is an niether odd nor even number");
		}
		
		else if(x%2==0)
		{
			System.out.println(x+" is an even number");
		}
		else if(x%2==1)
		{
			System.out.println(x+" is an odd number");
		}
		
	}
		
		

}
