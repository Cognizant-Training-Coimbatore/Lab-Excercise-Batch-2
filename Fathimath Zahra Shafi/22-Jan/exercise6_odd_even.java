import java.util.Scanner;

public class exercise6_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		if(n%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}

}
