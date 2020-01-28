import java.util.Scanner;

public class prog12_sumofdigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int x=sc.nextInt();
		int c=x;
		int s=0,t;
		while(c>0)
		{
			t=c%10;
			s=s+t;
			c=c/10;
		}
		System.out.println("Sum of digits: "+s);
	}

}
