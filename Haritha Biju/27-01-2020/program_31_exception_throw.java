
public class program_31_exception_throw
{
	static void checkEligibilty(int Age)
	{
		if(Age>20&&Age<60)
		{
			System.out.println("student entry is valid");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration")
		}
	}
	public static void main(String[] args) 
	{
	

	}

}
