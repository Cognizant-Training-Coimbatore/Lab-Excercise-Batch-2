import java.util.Scanner;

public class program5_invalid_mark {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int m=sc.nextInt();
		
		if(m>=0)
			System.out.println("The mark is : "+m);
		else
			throw new ArithmeticException("Invalid mark entered");
		

	}

}
