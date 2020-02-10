import java.util.Scanner;

public class ex6_even
{

	public static void main(String[] args)
	{
		
	int a;
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	
	if(a==0)
	{
			System.out.println("Number neither odd nor even");
	}
	
	
	else if(a%2==0)
	{
		System.out.println("1");
	}
	else if (a%2==1)
	{
		System.out.println("0");
	}
	
	
	
	

}

}
