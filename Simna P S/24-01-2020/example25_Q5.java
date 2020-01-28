import java.util.Scanner;

public class example25_Q5 
{

	public static void main(String[] args) 
	{
		int i,j,r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the limit");
		r= scanner.nextInt();
		for(i=1;i<=r;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println(" ");
		}

	}

}
