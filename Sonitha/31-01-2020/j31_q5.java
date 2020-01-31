import java.util.Scanner;

public class j31_q5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		if(no%2 == 2) {
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}

	}

}
