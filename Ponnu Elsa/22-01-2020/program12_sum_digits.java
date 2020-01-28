import java.util.Scanner;

public class program12_sum_digits {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
	 	int a = s.nextInt();
	 	int x,y,z;
	 	x=a%10;
	 	y=a/10;
	 	z=x+y;
	 	System.out.println("The sum of digits is:"  +z);
	}

}
