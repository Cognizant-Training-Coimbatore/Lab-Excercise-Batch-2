package exceptionhandling;

public class pgm06_27_throw
{
	static void check(int age)
	{
		if (age>20 && age <60)
		{
			System.out.println("Student entry is valid");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(25);
		check(65);
	}

}
