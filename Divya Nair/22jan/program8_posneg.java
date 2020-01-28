import java.util.Scanner;

public class program8_posneg {
	

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the number:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n>0)
		{
			System.out.println("\nThe number is positive");
		}
		else if(n<0)
			System.out.println("\nThe number is negative");
		else
			System.out.println("\nThe number is neither positive nor negative");

	}

}
