package project1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question13_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> a1=new TreeSet<String>();
		
		a1.add("red");
		a1.add("green");
		a1.add("blue");
		a1.add("orange");
		a1.add("violet");
		a1.add("white");
		System.out.println("elements of a1"+a1);
		TreeSet<String> a2=new TreeSet<String>();
		a2.add("red");
		a2.add("black");
		a2.add("white");
		a2.add("pink");
		System.out.println("elements of a2"+a2);
		a1.addAll(a2);
		System.out.println(a1);

	}

}
