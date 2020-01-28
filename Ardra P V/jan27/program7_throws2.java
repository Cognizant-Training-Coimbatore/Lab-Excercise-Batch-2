
public class program7_throws2 {

	public static void checkEligibility(int Age){
		// TODO Auto-generated method stub
		if(Age>20 && Age<60) {
			System.out.println("Student entry is valid");
		}
		else {
			throw new ArithmeticException("Student is not eligible for reg");
		}

	}
	public static void main(String[] args) {
		checkEligibility(44);
		checkEligibility(15);
		checkEligibility(65);
	}

}
