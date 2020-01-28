
public class program82_throw {
static void checkEligibility(int Age)
{
	if(Age > 20 && Age <  60)
	{
		System.out.println("Entry is valid");
	}
	else
	{
		throw new ArithmeticException("Student is not eligible for registering");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);
	}

}
