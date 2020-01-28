
public class program45_throw {
static void checkEligibility(int Age) {
	if(Age>20 & Age<60) {
		System.out.println("Student Entry is valid");
	}
	else
	{
		throw new ArithmeticException("Student is not Eligible for registration");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkEligibility(44);
checkEligibility(15);
checkEligibility(65);
	}

}
