import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
	int x,i,Avg, s=0, sum=0;
	System.out.println("Enter the values for x");
	Scanner scanner = new Scanner(System.in);
	for(i=0;i<5;i++)
		{
		s=scanner.nextInt();
			sum=sum+s;
			}
	Avg=sum/5;
	System.out.println("The sum is " + sum);
	System.out.println("The average is " + Avg);

	}

}
