import java.util.Scanner;

public class excep_q1 {

	
		// TODO Auto-generated method stub
		
		
		
		
		static void checkValidity(int n)
		{
			if(n>=0)
			{
				System.out.println("number is valid!");
			}
			else
			{
				throw new ArithmeticException("number is not valid");
			}
	}

		public static void main(String[] args) {
			int n;
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter number");
			n=scanner.nextInt();
			checkValidity(n);
			
			
		
		}
}