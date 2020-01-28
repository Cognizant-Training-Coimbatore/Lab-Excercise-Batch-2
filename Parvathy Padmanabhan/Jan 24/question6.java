import java.util.Scanner;
public class question6 {

	public static void main(String[] args)
	{
		int sum=0, count=0;
		float avg=0 ;
		System.out.println("Input");
		Scanner input=new Scanner(System.in);
		for (;;)
		{
			int a=input.nextInt();
			if(a==-999)
			{
				System.out.println("Thanks!");
				break;
			}
			else
			{
				count++;
				sum=sum+a;
			}
			System.out.println("Input again:");
		}
		avg=sum/count;
		System.out.println("Sum:" + sum );
		System.out.println("Average:" + avg );
		input.close();
	}

}
