import java.util.Scanner;
public class program6_sum_avg

{

	public static void main(String[] args)
	{
		System.out.println("Enter five numbers:");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			int number=sc.nextInt();
			 sum=sum+number;
		}
      System.out.println("The sum of numbers:"+sum);
      float avg=sum/5;
      System.out.println("Avg is:"+avg);
	}

}
