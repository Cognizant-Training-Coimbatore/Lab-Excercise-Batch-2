import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			int a,b;
			System.out.println("Enter a number: ");
			a=sc.nextInt();
			System.out.println("Enter another number: ");
			b=sc.nextInt();
			int result;
			result=a/b;
			System.out.println("Result : "+result);
		}
		catch(Exception e)
		{
			System.out.println("Error encounterd...."+e);
		}
	}

}
