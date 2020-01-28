import java.util.Scanner;

public class program8_positive {

	public static void main(String[] args) 
	{
		int x;
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		if(x>0)
		{
			System.out.println("number IS POSITIVE");
		}
		else
		{
			System.out.println("number is not positive");
		}
	}

}
