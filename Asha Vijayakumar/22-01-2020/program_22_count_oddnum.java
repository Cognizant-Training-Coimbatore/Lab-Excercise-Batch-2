import java.util.Scanner;

public class program_22_count_oddnum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num,i;
		int count = 0;
		System.out.println("Enter the limit");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(i=0;i<num;i++)
		{
			System.out.println(+ i);
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("The count of odd numbers ");
		System.out.println(+ count);
		

	}

}
