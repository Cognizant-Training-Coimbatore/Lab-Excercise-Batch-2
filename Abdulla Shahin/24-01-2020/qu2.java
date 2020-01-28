import java.util.Scanner;

public class qu2 {

	public static void main(String[] args)
	{
		System.out.println("enter the num:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*n);
		}

	}

}
