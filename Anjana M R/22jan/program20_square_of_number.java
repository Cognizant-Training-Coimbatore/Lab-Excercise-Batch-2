import java.util.Scanner;

public class program20_square_of_number {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	   a=sc.nextInt();
	   double sq=Math.pow(a, 2);
	   System.out.println("Square of the number="+sq);

	}

}
