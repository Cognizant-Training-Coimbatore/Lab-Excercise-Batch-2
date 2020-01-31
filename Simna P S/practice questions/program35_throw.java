
public class program35_throw 
{
static void CheckEligibility(int Age)
{
	if(Age>20 && Age<60)
	{
		System.out.println("student entry is valid!");
	}
	else
	{
		throw new ArithmeticException("student is not eligible for registration");
	}
}
	public static void main(String[] args) 
	{
		CheckEligibility(44);
		CheckEligibility(15);
		CheckEligibility(65);

	}

}
