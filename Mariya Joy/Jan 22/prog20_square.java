import java.util.Scanner;

public class prog20_square {

	public static void main(String[] args)
	{
		int x;
		double a;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		a=Math.pow(x, 2);
		System.out.println("The square of "+x+" is "+a);
		// TODO Auto-generated method stub

	}

}
