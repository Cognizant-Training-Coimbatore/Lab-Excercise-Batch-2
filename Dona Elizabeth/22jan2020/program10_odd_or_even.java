import java.util.Scanner;

public class program10_odd_or_even {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		if((a%2)==0)
		{
			System.out.println("The number entered is even");
		}
		else
		{
			System.out.println("The number entered is odd");
		}
	}

}
