import java.util.Scanner;

public class pgm21_divisibleornot {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0)
		{
			System.out.println("number is divisible by 7");
		}
		else
		{
			System.out.println("not divisible");
		}

	}

}
