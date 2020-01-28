import java.util.Scanner;

public class program53_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,c=3;

Scanner sc=new Scanner(System.in);

for(i=3;i>0;i--)
{
	System.out.println("i am thinking about a number can you guess it "+i+" attempts left");
	n=sc.nextInt(); 
	if(n==c)
	{
	System.out.println("Right number");
	break;
	}
	else 
	{
		System.out.println("Wrong number ");
	}
}
System.out.println("the correct no.is "+c);

	}

}
