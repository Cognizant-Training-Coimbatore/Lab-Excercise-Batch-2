import java.util.Scanner;

public class prog_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number,greater;
		System.out.println("Enter the maximum size");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int number1[] = new int[n];
		int i;
		System.out.println("Enter number 0");
		number = sc.nextInt();
		greater = number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter numbes "+i);
			number = sc.nextInt();
			number1[i] = number;
			if(number > greater)
			{
				greater = number;
			}
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Numbers are"+ number1[i]);
		}
		System.out.println("greater number"+greater);
	}

}
