import java.util.Scanner;

public class prog11_a_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter a: ");
		a=sc.nextInt();
		System.out.println("Enter b: ");
		b=sc.nextInt();
		c=a+b;
		d=c*c;
		System.out.println("Enter (a+b)^2:  "+d);

	}

}
