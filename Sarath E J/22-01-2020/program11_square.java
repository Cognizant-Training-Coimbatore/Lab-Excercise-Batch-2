import java.util.Scanner;

public class program11_square {

	public static void main(String[] args)
	{
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A and B");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int c = (a+b)*(a+b);
		System.out.println("The value of a*a+(2*a*b)+b*b "
				+ "= "+c);
		

	}

}
