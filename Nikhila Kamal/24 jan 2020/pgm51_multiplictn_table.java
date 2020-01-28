import java.util.Scanner;

public class pgm51_multiplictn_table {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println( i*n);
		}
		

	}

}
