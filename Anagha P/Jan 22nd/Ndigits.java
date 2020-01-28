import java.util.Scanner;
public class Ndigits
{
	public static void main(String args[])
	{
		int n,i,d,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		n=sc.nextInt();
		while(n>0)
		{
			d=n%10;
			count=count+1;
			n=n/10;
		}
		System.out.println("no of digits "+count);
	}
}