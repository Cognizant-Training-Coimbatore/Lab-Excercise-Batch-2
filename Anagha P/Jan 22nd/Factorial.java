import java.util.Scanner;
class Factorial
{
 public static void main(String[] args)
 {
	int f=1,n,c;
	System.out.println("enter the number\n");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
   	for(c=1;c<=n;c++)
	{
		f=f*c;
	}
	System.out.println("factorial is\n"+f);
}
	}