import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args)
	{ 
		int n,rem,rev=0;
		System.out.println("enter the number\n");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
  		while(n>0)
		{	
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse is\n"+rev);
	}
}