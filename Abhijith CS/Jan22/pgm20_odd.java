import java.util.Scanner;

public class pgm20_odd {

	public static void main(String[] args) {
		int a,b,c,d,e,i;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 nos  :");
			a=sc.nextInt();
			if((a%2) != 0)
			{
				System.out.println(a+"is odd");
				k=k+1;
			}
			b=sc.nextInt();
			if((b%2) != 0)
			{
				System.out.println(b+"is odd");
				k=k+1;
			}
			c=sc.nextInt();
			if((c%2) != 0)
			{
				System.out.println(c+"is odd");
				k=k+1;
			}
			d=sc.nextInt();
			if((d%2) != 0)
			{
				System.out.println(d+"is odd");
				k=k+1;
			}
			e=sc.nextInt();
			if((e%2) != 0)
			{
				System.out.println(e+"is odd");
				k=k+1;
			}
		System.out.println("Number of odd numbers : "+k);
	}

}
