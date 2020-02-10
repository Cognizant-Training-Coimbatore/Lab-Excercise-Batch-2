package jan31;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		String reverse = "";
		for(int i =(s.length()-1);i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println("the reversed string is " +reverse);
	}

}
