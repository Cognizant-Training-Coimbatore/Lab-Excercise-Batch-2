import java.util.Scanner;

public class questn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String reverse = "";
		int length = str.length();
		for(length=length-1;length>=0;length--)
		{
		reverse= reverse + str.charAt(length);
		}
		System.out.println("Reversed string is ");
		System.out.println(reverse);
	}

}
