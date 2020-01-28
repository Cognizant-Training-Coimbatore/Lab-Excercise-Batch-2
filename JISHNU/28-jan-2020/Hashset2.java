package day6;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset=new HashSet<String>();
		myset.add("One");
		myset.add("Two");
		myset.add("One");//no duplicate will be taken
		myset.add("Three");
		System.out.println(myset);
		for(String s:myset)
			System.out.println(s);
		
	}

}
