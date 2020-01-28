import java.util.Scanner;
public class program24_q6_sum {

	public static void main(String[] args)
	{
		int flag=0;
		int f=0;
		int sum=0;
		int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	while(f==0)
	{
		int n=sc.nextInt();
		sum=sum+n;
		if(n==-999)
		{
			f=1;
		}
		count++;
	}
	System.out.println("sum is" +sum);
	System.out.println("average is" +sum/count);
	
	
	

	}

}
