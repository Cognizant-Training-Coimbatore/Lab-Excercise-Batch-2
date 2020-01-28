import java.util.Scanner;

public class pgm60_press_sum_avg {

	public static void main(String[] args) 
	{
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0;
	int avg=0;
	int i=0;
	while(n!=-999)
	{
		i=i+1;
		s=s+n;
		avg=s/i;
		n=sc.nextInt();
	}
	System.out.println("sum is:" + s);
	System.out.println("average is:" + avg);
	}

}
