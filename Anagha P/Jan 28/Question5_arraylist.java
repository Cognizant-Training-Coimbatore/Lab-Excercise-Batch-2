package demo;

import java.util.ArrayList;
import java.util.List;

public class Question5_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1=new ArrayList<String>();
		
		a1.add("red");
		a1.add("green");
		a1.add("blue");
		a1.add("orange");
		a1.add("violet");
		a1.add("white");
		System.out.println("before replacement:"+a1);
		a1.set(3, "pink");
		System.out.println("after replacement"+a1);

	}

}
