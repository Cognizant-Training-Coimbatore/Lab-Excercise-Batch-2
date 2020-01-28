import java.util.Scanner;

public class questn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();
		String str=str1;
		String reverse = "";
		int length = str.length();
		for(length=length-1;length>=0;length--)
		{
		reverse= reverse + str.charAt(length);
		}
		if(str1.equals(reverse))
		{
		System.out.println("It is a palidrome");
		}
		else
		{
		System.out.println("It is not a palidrome");
		}
	}

}
