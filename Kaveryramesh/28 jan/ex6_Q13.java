package demo;

import java.util.TreeSet;

public class ex6_Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		TreeSet<String> myset1 = new TreeSet<String>();
		myset.add("kavery");
		myset.add("fathima");
		myset.add("sasna");

		System.out.println(myset);
		myset1.addAll(myset);
		System.out.println(myset1);
		
	}

}
