
public class program6_exception_throw {
	static void checkEligibility(int Age)
	{
		if(Age > 20 && Age<60)
		{
			System.out.println("Student Entry is Valid!!");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registartion");
		}
	}

	public static void main(String[] args) {
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);
		
	}

}
