import java.util.Scanner;

public class aplusb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers a and b");
		Scanner soc =new Scanner(System.in);
		int a=soc.nextInt();
		int b=soc.nextInt();
		int c=(a*a+b*b+a*b);
		System.out.println("(a+b)^2      >>"+c);

	}

}
