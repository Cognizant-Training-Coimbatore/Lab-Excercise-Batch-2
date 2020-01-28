import java.util.Scanner;

public class program20_display_square {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner n=new Scanner(System.in);
		num=n.nextInt();
		int sq=num*num;
		System.out.println("The square of neterd number is "+sq);
	}

}
