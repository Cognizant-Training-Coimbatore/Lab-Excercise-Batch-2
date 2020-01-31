import java.util.Scanner;

public class pgm_6 {

	public static void main(String[] args) {
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}

	}

}
