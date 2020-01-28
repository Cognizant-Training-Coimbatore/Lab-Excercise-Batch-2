import java.util.Scanner;

public class j24_q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int a= sc.nextInt();
		System.out.println("Enter the upper limit");
		int b = sc.nextInt();
		System.out.println("The numbers between "+a +" and "+b +" are as follows : ");
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}

	}

}
