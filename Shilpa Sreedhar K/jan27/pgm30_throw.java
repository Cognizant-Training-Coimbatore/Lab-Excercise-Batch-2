
public class pgm30_throw {
	static void checkEligibility(int Age)
	{
		if(Age>20 && Age<60)
		{
			System.out.println("student entry is valid");
		}
		else
		{
			throw new ArithmeticException("student not eligible for registratn");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);
	
	}

}
