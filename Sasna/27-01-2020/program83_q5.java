import java.util.Scanner;

public class program83_q5 {
static void validate(int x)throws myexception
	
	{
		if(x<0)
			throw new myexception("this is invalid");
		else
			System.out.println("this is valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("to check wether the marks entered is valid");
		Scanner scanner =new Scanner(System.in);
		x = scanner.nextInt();
		try
		{ 
			validate(x);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:" +m);
		}

	}

}
