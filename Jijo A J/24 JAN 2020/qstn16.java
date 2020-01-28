import java.util.Scanner;

public class qstn16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of N");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int a;
for(int i=0;i<n;i++)
{
	System.out.println("Enter the number");
	a=sc.nextInt();
	
	if(a==-999)
	{
		i=n;
	}
	else
	{
		sum+=a;
	}
	
}
System.out.println("sum :"+sum);
System.out.println("average :"+sum/n);
	}

}
