import java.util.Scanner;

public class program8_positive_or_negative {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		if(a<0)
		{
			System.out.println("The number entered is negative");
		}
		else if(a==0)
		{
			System.out.println("The number entered is zero");
		}
		else
		{
			System.out.println("The number entered is positive");
		}
		
	}

}
