import java.util.Scanner;

public class exercise12_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Multiples of : " + i);
			for(j=1;j<=10;j++)
			{
				System.out.print(i*j + "  ");
			}
			System.out.println("  ");
		}
	}

}
