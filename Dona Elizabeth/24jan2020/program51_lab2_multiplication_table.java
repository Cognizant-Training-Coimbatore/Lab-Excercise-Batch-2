import java.util.Scanner;

public class program51_lab2_multiplication_table {

	public static void main(String[] args) {
		int n,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 and 9");
		n=sc.nextInt();
		for(c=1;c<=n;c++)
		{
			System.out.println("Multiplication table of "+c);
			for(b=1;b<=10;b++)
			{
				System.out.println(c*b);
			}
		}
		
	}

}
