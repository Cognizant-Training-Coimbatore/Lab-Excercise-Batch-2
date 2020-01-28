
public class program1_throw {
	static void checkEligibility(int age)
	{
		
		if(age >20 && age<60)
		{
			System.out.println("Student entry is valid");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for regstration");
			
		}
	}
	

	public static void main(String[] args) {
	checkEligibility(44);
	checkEligibility(15);
	checkEligibility(65);
	}

}
