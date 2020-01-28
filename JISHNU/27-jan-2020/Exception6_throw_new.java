package day5;

public class Exception6_throw_new {
	static void checkEligibility(int age)
	{
		if(age>20 && age<60)
		{
			System.out.println("Student is valid");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration");//throw for our own exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(66);
	}

}
