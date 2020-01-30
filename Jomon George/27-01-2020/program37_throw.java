package demo;

public class program37_throw {

	static void checkAvailability(int age)
	{
		if(age > 20 && age < 60)
		{
			System.out.println("Student entry is valid");
		}
		else
		{
			throw new ArithmeticException("Stident is not eligible for registration");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkAvailability(44);
		checkAvailability(15);
		checkAvailability(65);
	}

}
