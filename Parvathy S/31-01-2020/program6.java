import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int a = sc.nextInt();
		if(a%3==0 && a%11==0)
		{
			System.out.println("The no is divisible");
		}
		else
		{
			System.out.println("The no is not divisible");
		}

	}

}
