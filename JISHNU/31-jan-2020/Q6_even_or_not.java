import java.util.Scanner;

public class Q6_even_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		if(number%2==0)
			System.out.println(1);
		else
			System.out.println(0);

	}

}
