import java.util.Scanner;

public class program6_five 
{

	public static void main(String[] args)
	{
		int n,i,s=0,avg;
		
		System.out.println("Enetr the limit of numbers:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		System.out.println("\nThe Numbers are:");
		
		for(i=1;i<=n;i++)
		{
			System.out.println(+i);
			s=s+i;
			
		}
		avg=s/n;
		System.out.println("\nThe sum is:" +s);
		System.out.println("\nThe avg is:" +avg);
		
		
		

	}

}
