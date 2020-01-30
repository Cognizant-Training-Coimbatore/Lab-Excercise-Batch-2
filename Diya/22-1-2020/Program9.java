import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		if(x%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		

	}

}
