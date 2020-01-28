package monday;

public class ThrowValidation
{
static void checkeligiblity(int age)
{
if(age>20 && age<60)
{
	System.out.println("student entry is valid!!");
}
else
{
	throw new ArithmeticException("Student is not eligible for registration");
}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkeligiblity(45);
		checkeligiblity(45);
		checkeligiblity(10);
	}

}
