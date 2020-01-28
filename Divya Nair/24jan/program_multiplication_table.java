import java.util.Scanner;

public class program_multiplication_table {

	public static void main(String[] args)
	{
		int i,res=0;
		System.out.println("Enter an integer");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		for(i=0;i<=N;i++)
		{
			res=i*N;
			System.out.println(res);
		}
		
		

	}

}
