import java.util.Scanner;

public class num_pos_or_neg {

	public static void main(String[] args) {
	int num;
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	if(num > 0) {
		System.out.println("the number is positive");
	}
		else if (num < 0) {
			System.out.println("the number is negative");
		}
	}


}
