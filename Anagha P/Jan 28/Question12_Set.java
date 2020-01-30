package project1;


import java.util.HashSet;

import java.util.Set;

public class Question12_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> a1=new HashSet<String>();
		
		a1.add("red");
		a1.add("green");
		a1.add("blue");
		a1.add("orange");
		a1.add("violet");
		a1.add("white");
		System.out.println(a1);
		Set<String> a2=new HashSet<String>();
		a2.add("red");
		a2.add("black");
		a2.add("white");
		a1.retainAll(a2);
		System.out.println("common elements"+a1);

	}

}
