
public class program_Checkeligibility 
{
	static void check(int age)
	{
		if(age>20&&age<60)
		{
			System.out.println("Student entry is valid");
		}
		else
		{
			throw new ArithmeticException("Student is not eligible for registeration");
		}
	}
	public static void main(String[] args)
	{
		check(44);
		check(15);
		check(65);
		

	}

}
