import java.util.Scanner;

public class j24_q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int value = 1+ (int)(Math.random()*9);
	 
	 System.out.println("Iam thinking about a number between 0 and 9.Can you guess it ?(3 attempt(s) left): ");
	 int guess_value = sc.nextInt();
	 if(guess_value!=value)
	 {
		 System.out.println("Sorry.Wrong number.Iam thinking about a number between 0 and 9.Can you guess it ?(2 attempt(s) left):");
	     guess_value = sc.nextInt();
	     if(guess_value !=value)
	 {
		 System.out.println("Sorry.Wrong number.Iam thinking about a number between 0 and 9.Can you guess it ?(1 attempt(s) left):");
	     guess_value = sc.nextInt();
	     if(guess_value !=value)
		 {
			 System.out.println("Sorry.Wrong Number.The correct number is :"+ value);
		 }else
		 {
			 System.out.println("You have entered the correct number.");
		 }
	 }else
	 {
		 System.out.println("You have entered the correct number.");
	 }
	 }else
	 {
		 System.out.println("You have entered the correct number.");
	 }

	}

}
