import java.util.Scanner;

public class program22_count_odd 
{

	public static void main(String[] args)
	{
		int a,i,count=0;
		System.out.println("Enter 5 numbers");
		
		for(i=0;i<5;i++)
		{
			Scanner scanner=new Scanner(System.in);
			a=scanner.nextInt();
			if(a%2!=0)
			{
				count++;
			}
		}
		System.out.println("Number of odd numbers = " +count);
			
	}

}
