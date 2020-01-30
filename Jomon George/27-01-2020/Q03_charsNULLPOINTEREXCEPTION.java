package Exercise;

import java.util.Scanner;

public class Q03_charsNULLPOINTEREXCEPTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = scanner.nextLine();
		try {
			
			int length = input.length();
			if(input.length() == 0)
				throw new NullPointerException("NULL length string");
			else
				System.out.println("String Length : " + length);
		}
		catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught : " + e); 
        } 
	}

}
