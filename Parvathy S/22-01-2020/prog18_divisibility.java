import java.util.Scanner;

public class prog18_divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if(a%7==0)
		{
			System.out.println("no: is divisible");
		}
		else
		{
			System.out.println("no: is not divisible");
		}

	}

}
