import java.util.Scanner;

public class prog11_quad_eqn {

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter two numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("The output is "+c );
		
		// TODO Auto-generated method stub

	}

}
