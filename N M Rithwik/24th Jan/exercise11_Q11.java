import java.util.Scanner;

public class exercise11_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number :");
		i = sc.nextInt();
		n = sc.nextInt();
		while(i<=n)
		{
			System.out.print(i + "  ");
			i++;
		}
	}

}
