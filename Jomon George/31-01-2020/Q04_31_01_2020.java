package Exercise;

import java.util.Scanner;

public class Q04_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input String : ");
		String str = scanner.next(), rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
		System.out.println("reverse : " + rev);
	}

}
