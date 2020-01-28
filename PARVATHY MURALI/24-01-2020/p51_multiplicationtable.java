import java.util.Scanner;

public class p51_multiplicationtable 
{

	public static void main(String[] args) 
	{
		int m=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 and 9:");
		int N=sc.nextInt();
		if(N>9 ||N<1)
		{
			System.out.println("!!out of range!!");
			System.exit(0);
		}
		for(int i=1;i<=N;i++)
		{
			m=N*i;
			System.out.println(i+"x"+N+"="+m);
		}

	}

}
