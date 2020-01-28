import java.util.Scanner;

public class prog21_seven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int x=sc.nextInt();
		if(x%7==0)
				System.out.println("It is divisible by 7");
		else
				System.out.println("not divisible");

	}

}
