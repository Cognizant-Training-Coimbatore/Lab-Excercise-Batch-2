import java.util.Scanner;

public class program51_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i = length-1; i >=0; i--) {
			reverse = reverse+original.charAt(i);
		}
		System.out.println("reverse of the string:" + reverse);
	}

}
