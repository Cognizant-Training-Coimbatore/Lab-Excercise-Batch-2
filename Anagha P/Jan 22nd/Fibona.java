import java.util.Scanner;
public class Fibona
{
	public static void main(String args[])
	{
		int n,i,a,b,c;
		System.out.println("enter  the limit\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=1;
		b=1;
		System.out.println(a+"\n"+b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("\n"+c);
		}
	}
}
			