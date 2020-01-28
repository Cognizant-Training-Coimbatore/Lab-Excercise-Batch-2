import java.util.Scanner;

public class div_by_seven {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a%7==0)
		{
			System.out.println(a + " is divisible by 7");
		}
		else
		{
			System.out.println(a + " is not divisible by 7");
		}
	}

}
