
public class areax
{
	static void checkEligibilty(int Age)
	{
		if(Age>20&&Age<60)
		{
			System.out.println("Student entry is valid");
	}
		else
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
	}



	public void main(String[] args) {
		// TODO Auto-generated method stub
checkEligibilty(44);
checkEligibilty(15);
checkEligibilty(65);

	}
}


