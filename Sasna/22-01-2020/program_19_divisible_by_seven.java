import java.util.Scanner;

public class program_19_divisible_by_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%7 == 0) {
			System.out.println("the number is divisible by 7");
		}
		else {
			System.out.println("the number is not divisible by 7");
		}
		

	}

}
