import java.util.Scanner;

public class program8_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		System.out.println("Enter the value of y");
		Scanner scanner=new Scanner(System.in);
		y=scanner.nextInt();
		if(y%2==0) {
			System.out.println(y+ " is a even number");
		}
		else {
			System.out.println(y+ " is a odd number");
		}

	}

}
