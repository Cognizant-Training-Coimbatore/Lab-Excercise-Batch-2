import java.util.Scanner;

public class program30_arrays {

	public static void main(String[] args)
	{
		int n,number,greater;
		System.out.println("Enter the maximum size");
		Scanner scanner =new Scanner(System.in);
		n = scanner.nextInt();
		int numbers1[] = new int[n];
		int i;
		System.out.println("Enter number 0" );
		number =scanner.nextInt();
		greater =number;
		numbers1[0]=number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter number" +i);
			number =scanner.nextInt();
			numbers1[i] =number;
			if(number>greater)
			{
				greater =number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Numbers are"+numbers1[i]);
			
		}
		System.out.println("Greatest number"+greater);
				
	}

}
