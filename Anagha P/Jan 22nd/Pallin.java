import java.util.Scanner;
public class Pallin
{
	public static void main(String[] args)
	{ 
		int n,rem,m=0,rev=0;
		System.out.println("enter the number\n");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=n;
  		while(n>0)
		{	
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(m==rev)
		{
			System.out.println("number is pallindrome\n");
		}
		else
		{
			System.out.println("not pallindrome");
	
        	}
       }
}