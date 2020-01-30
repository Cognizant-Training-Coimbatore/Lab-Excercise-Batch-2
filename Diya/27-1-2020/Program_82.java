import java.util.Scanner;

public class Program_82 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		int a=sc.nextInt();
		System.out.println("Enter num2") ;
		int b=sc.nextInt();
		int result = 0;
		try
		{
			
			result=a/b;
		}
		catch (Exception e)
		{
			System.out.println("Error in the code "+e);
		}
		System.out.println("num1/num2= "+result);
	}
}

