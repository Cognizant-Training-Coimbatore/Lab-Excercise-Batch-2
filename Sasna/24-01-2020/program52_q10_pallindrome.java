import java.util.Scanner;

public class program52_q10_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i = length-1; i >=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("the string is pallindrome");
		}
		else {
			System.out.println("the string is not pallindrome");

		}
	}
	

}
