import java.util.Scanner;

public class pgm_p_or_n {

	public static void main(String[] args)
	{
		System.out.println("enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");											
		}
		
	}

}
