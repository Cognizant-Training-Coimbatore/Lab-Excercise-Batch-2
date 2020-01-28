import java.util.Scanner;

public class program21_divisible_by_seven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner n=new Scanner(System.in);
		num=n.nextInt();
		if (num%7==0)
		{
			System.out.println("The number is divisible by 7");
		}
		else
		{
			System.out.println("The number is not divisible by 7");
		}
	}

}
