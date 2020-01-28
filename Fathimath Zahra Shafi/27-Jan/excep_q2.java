import java.util.Scanner;

public class excep_q2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int n1,n2;
			float result=0;
			System.out.println("enter n1 and n2");
			Scanner scanner=new Scanner(System.in);
			n1=scanner.nextInt();
			n2=scanner.nextInt();
			result=n1/n2;
			System.out.println("result is: " +result);
		}

		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occurs");
		}

	}

}
