import java.util.Scanner;

public class practice7_equation {

	public static void main(String[] args) 
	{
		int a,b=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		result=(a+b)*(a+b);
		System.out.println("The result of equation (a+b)^2 is " +result);
	}

}
