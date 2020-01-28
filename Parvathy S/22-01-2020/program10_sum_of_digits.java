import java.util.Scanner;

public class program10_sum_of_digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no: ");
		int a= sc.nextInt();
		int x,y,z;
		x=a%10;
		y=a/10;
		z=x+y;
		System.out.println("Sum of the digits is: "+z);

	}

}
