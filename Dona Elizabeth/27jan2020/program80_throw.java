
public class program80_throw {
	static void checkEligibility(int age)
	{
		if(age>20&&age<60)
		{
			System.out.println("Valid entry");
		}
		else
		{
			throw new ArithmeticException("Invalid entry");
		}
	}

	public static void main(String[] args) {
		checkEligibility(44);
		checkEligibility(65);
	}

}
