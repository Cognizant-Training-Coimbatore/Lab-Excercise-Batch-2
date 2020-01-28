import java.util.Scanner;

public class excep_q7 {

	static void checkValidity(int n)
	{
		if(n>=101 && n<=200)
		{
			System.out.println("employee code is valid!");
		}
		else
		{
			throw new ArithmeticException("employee code is rejected!");
		}
}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter employee code");
		n=scanner.nextInt();
		checkValidity(n);


	}

}
