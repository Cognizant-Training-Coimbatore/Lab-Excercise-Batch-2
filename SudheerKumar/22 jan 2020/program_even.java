import java.util.Scanner;

public class program_even {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the value of a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		System.out.println(+a);
	}

}
