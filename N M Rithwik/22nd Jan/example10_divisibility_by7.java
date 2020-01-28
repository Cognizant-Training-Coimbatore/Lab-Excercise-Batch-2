import java.util.Scanner;

public class example10_divisibility_by7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		x = sc.nextInt();
		if(x%7==0)
			System.out.println("Divisible");
		else
			System.out.println("Not divisible");
	}

}
