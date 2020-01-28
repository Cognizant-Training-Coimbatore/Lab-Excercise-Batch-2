import java.util.Scanner;

public class pgm11_equation {

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("enter the value of a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter the value of b");
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		
		int c=(a*a)+(2*a*b)+(b*b);
		System.out.println("The output is:" + c);
		
		

	}

}
