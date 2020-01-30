
public class Program_81 {

	static void checkEligibility(int num)
	{
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			throw new ArithmeticException("Number is not positive");
		}
	}

	public static void main(String[] args)
	{
		checkEligibility(33);

	}

}
