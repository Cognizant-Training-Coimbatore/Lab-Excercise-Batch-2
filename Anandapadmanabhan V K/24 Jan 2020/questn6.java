import java.util.Scanner;

public class questn6 {

	public static void main(String[] args)
	{
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	float avg=0;
	int i=0;
	while(n!=-999)
	{
		i=i+1;
		sum=sum+n;
		avg=sum/i;
		n=sc.nextInt();
	}
	System.out.println("The sum is " + sum);
	System.out.println("The average is " + avg);
	}

}
