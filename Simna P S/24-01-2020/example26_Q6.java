import java.util.Scanner;

public class example26_Q6 
{

	public static void main(String[] args) 
	{
		
		int i,r,sum=0,avg,flag=0;
		Scanner scanner = new Scanner(System.in);
		
		for(i=0;i!=999;)
		{
			System.out.println("Enter the numbers"+ "" );
			i= scanner.nextInt();
			
			sum=sum+i;
			flag=flag+1;
		}
		avg=sum/flag;
		
		System.out.println("sum = "+sum);
		System.out.println("average = "+avg);
	}

}
