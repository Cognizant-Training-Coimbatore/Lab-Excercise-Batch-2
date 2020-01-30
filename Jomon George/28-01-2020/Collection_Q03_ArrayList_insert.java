package Exercise;

import java.util.ArrayList;

public class Collection_Q03_ArrayList_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		colors.add(0, "blue");
		System.out.println(colors.get(0));
	}

}
