import java.util.Scanner;

public class loopQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of N");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int x;
for(int i=0;i<n;i++)
{
	System.out.println("Enter the number");
	x=sc.nextInt();
	
	if(x==999)
	{
		i=n;
	}
	else
	{
		sum+=x;
	}
	
}
System.out.println("sum :"+sum);
System.out.println("average :"+sum/n);
	}

}