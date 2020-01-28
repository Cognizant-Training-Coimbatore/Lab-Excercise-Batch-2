import java.util.Scanner;

public class exercise8_ab_square_formula {
	public static void main(String[] args)
	{
		int a,b,result=0;
		
		System.out.println("enter a and b ");
		Scanner scanner= new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		result= (a*a)+(2*a*b)+(b*b);
		
		System.out.println("result is: " +result);
		
	}

}
