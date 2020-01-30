import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value for a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value for b");
		Scanner scanner=new Scanner(System.in);
		int b=scanner.nextInt();
		int x=a*a;
		int y=2*a*b;
		int z=b*b;
		int sum=x+y+z;
		System.out.println("The square of sum of a and b is " + sum);
		
	}

}
