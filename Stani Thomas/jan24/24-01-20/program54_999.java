import java.util.Scanner;

public class program54_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,sum=0,c=0;
		int a=0;
System.out.println("enter numbers");
Scanner sc=new Scanner(System.in);
while(n!=999)
{
	c++;
	n=sc.nextInt();
	if(n!=999)
	{
	sum=sum+n;	
	a=sum/c;
	}
}
System.out.println("sum = "+sum);
System.out.println("average = "+a);
	}

}
