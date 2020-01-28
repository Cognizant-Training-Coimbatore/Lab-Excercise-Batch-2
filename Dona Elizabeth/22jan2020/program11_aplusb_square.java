import java.util.Scanner;

public class program11_aplusb_square {

	public static void main(String[] args) {
		int a,b;
		int result;
		System.out.println("Enter the value of a and b");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		b=num.nextInt();
		result=((a*a)+(2*a*b)+(b*b));
		System.out.println("The result of (a+b)^2 is "+result);
	}

}
