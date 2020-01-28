import java.util.Scanner;

public class Q6_program6 {

	
		
		static void validate() throws myexceptions
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int result=n1/n2;
		if(n2==0)
		{
			throw new myexceptions("invalid");
		}
		else
		{
			System.out.println("number1/number2:"+result);
		}
		
		}
		public static void main(String[] args) {
			try
			{
				validate();
			}
			catch (Exception e)
			{
				System.out.println("Error occured"+e);
			}

		}
	}


