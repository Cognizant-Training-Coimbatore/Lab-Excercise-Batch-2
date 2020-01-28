package jan28;

import java.util.TreeSet;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("red");
		myset.add("white");
		myset.add("violet");
		myset.add("green");
		System.out.println("elements in the first treeSet : " +myset);
		TreeSet<String> myset1=new TreeSet<String>();
		myset1=(TreeSet<String>) myset.clone();
		System.out.println("elements in the copied to next treeSet : " +myset1);
		

	}

}
