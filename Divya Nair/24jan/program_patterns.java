import java.util.Scanner;

public class program_patterns {

	public static void main(String[] args)
	{
		int i,j;
		System.out.println("Enter the number of Rows:");
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}

	}

}
