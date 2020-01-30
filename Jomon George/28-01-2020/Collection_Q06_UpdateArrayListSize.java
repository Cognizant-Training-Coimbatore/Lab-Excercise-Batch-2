package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_Q06_UpdateArrayListSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		System.out.println(colors);
		
		colors.ensureCapacity(100);
		System.out.println("ArrayList can now surely store upto 100 elements.");
		
	}

}
