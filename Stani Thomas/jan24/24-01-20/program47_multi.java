import java.util.Scanner;

public class program47_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,j,r;
System.out.println("enter a number between 1 and 9");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();	
for(i=1;i<=n;i++)
{System.out.println("multiplication table of "+i);
	for(j=1;j<=10;j++)
	{
	r=i*j;
	
	System.out.println(r);
	}
}
	}

}
