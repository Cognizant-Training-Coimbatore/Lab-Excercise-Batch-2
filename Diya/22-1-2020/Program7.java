import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) 
	{
		int x;
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	x=scanner.nextInt();
	if(x>0)
	{
		System.out.println("The number is positive");
	}
	else
	{
		System.out.println("The number is negative");
	}
	}

}
