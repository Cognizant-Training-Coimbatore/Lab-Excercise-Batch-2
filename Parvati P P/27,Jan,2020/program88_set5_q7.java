package Package2;
public class program88_set5_q7 {

	public static void checkEligibility(int num) {
		if(num>101 && num<200) {
			System.out.println("Student entry is valid");
			}
			else {
			throw new ArithmeticException("Student is not eligible for reg");
			}
			      }

			public static void main(String[] args) {
			checkEligibility(110);
			checkEligibility(44);
			checkEligibility(215);
			}
		
	}


