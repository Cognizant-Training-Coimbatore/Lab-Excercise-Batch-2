import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Q7 {

	public static void checkEligibility(int num) {
		// TODO Auto-generated method stub
		
					
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


