
public class Program_76_throw {
	static void checkEligibility(int Age)
	{
		if(Age>20&&Age<60)
		{
			System.out.println("Student entry is valid!!");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
	}

	public static void main(String[] args)
	{
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);

	}

}
