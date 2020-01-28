import java.util.Scanner;

public class program2_twonumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int n1=sc.nextInt();
		System.out.println("Enter the second number ");
		int n2=sc.nextInt();
		try
		{
		int r=n1/n2;
		System.out.println("The result is "+r);
		}
		catch(Exception e)
		{
			System.out.println("Error in code "+e);
		}

}
}