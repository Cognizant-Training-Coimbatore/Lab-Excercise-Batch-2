import java.util.Scanner;

public class program8_check {

	public static void main(String[] args) 
	{	
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
			
		}
		else
		{
			System.out.println("negative or zero");
		}
		
		

	}

}
