
import java.util.Scanner;

public class qstn17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char w='A';
		for(int i=1;i<=n;i++)
			{
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(w++);
			w--;
			for(int j=2;j<=i;j++)
				System.out.print(--w);
			System.out.println();
			}
		for(int q=n-1;q>=1;q--)
			{
			for(int j=n-q;j>=1;j--)
				System.out.print(" ");
			for(int j=q;j>=1;j--)
				System.out.print(w++);
			w--;
			for(int j=2;j<=q;j++)
				System.out.print(--w);
			System.out.println();
			}
	
	}

}