import java.util.Scanner;

public class program71_arrays_largest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n, number, greater;
	{
		System.out.println("Enter rhe maximum size");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int number1[] = new int[n];
		int i;
		System.out.println("Enter number 0");
		number = scanner.nextInt();
		greater = number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter the number" +i);
			number = scanner.nextInt();
			number1[i]=number;
			if(number>greater)
			{
				greater = number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Numbers are" + number1[i]);
		}
		System.out.println("Greatest number" +greater);
	}

	

	}

}
