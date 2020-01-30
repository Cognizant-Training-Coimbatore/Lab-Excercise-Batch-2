import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		if(x%7==0)
		{
			System.out.println("The number is divisible by 7");
		}
		else
		{
			System.out.println("The number is not divisible by 7");
		}

	}

}
