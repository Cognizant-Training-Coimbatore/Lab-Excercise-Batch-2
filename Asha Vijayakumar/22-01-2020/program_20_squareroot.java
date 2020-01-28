import java.util.Scanner;

public class program_20_squareroot
{

	public static void main(String[] args) 
	{
		int num;
		double result;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		result=Math.pow(num, 2);
		System.out.println("The square of the number is" + result);
		
		// TODO Auto-generated method stub

	}

}
