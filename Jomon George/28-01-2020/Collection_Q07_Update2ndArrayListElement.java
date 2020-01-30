package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_Q07_Update2ndArrayListElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		System.out.println(colors);
		
		System.out.println("Enter the index to change and the update value: ");
		int index = scanner.nextInt();
		String str = scanner.next();
		colors.set(index, str);
		System.out.println(colors);
	}

}
