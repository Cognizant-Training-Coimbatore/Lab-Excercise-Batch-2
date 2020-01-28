import java.util.Scanner;

public class program_13_digit_sum
{

	public static void main(String[] args) 
	{
		int num,temp,remainder,sum = 0,digsum;
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		temp = num;
		remainder = temp % 10;
		sum = sum + remainder;
		temp = temp / 10;
		digsum = temp + remainder;
		System.out.println("The sum of the given number is:" + digsum);
		
		// TODO Auto-generated method stub

	}

}
