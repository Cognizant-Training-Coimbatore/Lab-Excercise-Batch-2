package exception_handling;

public class exception_6 {
	static void checkEligibility(int age)
	{
		if(age>20 && age<60)
		{
			System.out.println("student entry is valid");
		}
		else
		{
			throw new ArithmeticException("student is not eligible for registrstion");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkEligibility(44);
checkEligibility(15);
checkEligibility(65);
	}

}
