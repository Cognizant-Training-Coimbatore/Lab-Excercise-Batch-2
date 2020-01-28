import java.util.Scanner;

public class pgm19_divide7 {

	public static void main(String[] args) {
		int num1,sq;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num1=sc.nextInt();
		if((num1 % 7) == 0)
		{
			System.out.println(num1+" is divisible by 7");
		}
		else
		{
			System.out.println(num1+" is not divisible by 7");
		}

	}

}
