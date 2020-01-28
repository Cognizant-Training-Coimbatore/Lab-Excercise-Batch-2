import java.util.Scanner;

public class pgm11_sqr {

	public static void main(String[] args) {
		int num1,num2,sq;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num1=sc.nextInt();
		System.out.println("Enter another number:");
		num2=sc.nextInt();
		sq=(num1+num2)*(num1+num2);
		System.out.println("("+num1+" + "+num2+" )^2  = "+sq);
	}

}
