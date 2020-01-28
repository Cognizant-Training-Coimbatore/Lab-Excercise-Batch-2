
public class program50_throw 
{
	static void checkEligibility(int age)
	{
		if(age>20 &&age<60)
		{
			System.out.println("student entry is valid ");
		}
		else
		{
			throw new ArithmeticException("student is not eligibke for the registration");
		}
		
	}
	public static void main(String[] args) 
	{
		checkEligibility(23);
		checkEligibility(10);
		checkEligibility(73);
		
	}

}
