import java.util.Scanner;

public class program10_eveodd {
	

	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n%2==0)
			System.out.println("\nThe number is even");
		else
			System.out.println("\nThe number is odd");

	}

}
