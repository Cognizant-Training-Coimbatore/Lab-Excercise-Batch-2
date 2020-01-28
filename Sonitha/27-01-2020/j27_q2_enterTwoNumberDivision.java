import java.util.Scanner;

public class j27_q2_enterTwoNumberDivision {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    try {
		int c = a/b;
		System.out.println("The result is : "+ c);
	} catch (Exception e) {
	System.out.println("Exception : "+ e);
		System.out.println("Please enter a nonzero number as a second number.");
	}
	}

}
