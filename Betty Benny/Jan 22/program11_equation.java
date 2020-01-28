import java.util.Scanner;

public class program11_equation 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter 2 numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("Answer is " + c);
		
		// TODO Auto-generated method stub

	}

}
