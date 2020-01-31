import java.util.Scanner;

public class j31_q14 {

	public static void main(String[] args) {
		int x,n,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		x=sc.nextInt();
		System.out.println("Enter y");
		y=sc.nextInt();
		System.out.println("Enter n");
		n = sc.nextInt();
		int result=(x*n)%y;
		System.out.println(result);
		

	}

}
