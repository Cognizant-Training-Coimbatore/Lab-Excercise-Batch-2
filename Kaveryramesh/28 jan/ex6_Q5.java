package demo;

import java.util.ArrayList;

public class ex6_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String> ();
		list1.add("Black");
		list1.add("White");
		list1.add("Red");
		list1.add("yellow");
		System.out.println(list1);

		  list1.set( list1.indexOf("yellow") , "blue");
		  System.out.println(list1);

	}

}
