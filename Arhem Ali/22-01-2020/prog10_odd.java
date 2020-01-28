import java.util.Scanner;

public class prog10_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter number: ");
		x=sc.nextInt();
		if(x%2==0)
			System.out.println("its even ");
		else
			System.out.println("its odd");
		

	}

}
