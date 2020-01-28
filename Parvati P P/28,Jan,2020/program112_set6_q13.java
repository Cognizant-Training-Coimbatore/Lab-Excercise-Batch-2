package Package3;

import java.util.TreeSet;

public class program112_set6_q13 {

	public static void main(String[] args) {
		TreeSet<String>myset=new TreeSet<String>();
		TreeSet<String>ourset=new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		System.out.println("\nFirst TreeSet: " + myset);
		ourset=(TreeSet)myset.clone();	
		System.out.println("\nSecond TreeSet: " + ourset);

	}

}
