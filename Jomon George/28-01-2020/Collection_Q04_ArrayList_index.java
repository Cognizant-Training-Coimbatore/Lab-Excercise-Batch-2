package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_Q04_ArrayList_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		int index = scanner.nextInt();
		colors.add(index, "blue");
		System.out.println(colors.get(index));
	}

}


