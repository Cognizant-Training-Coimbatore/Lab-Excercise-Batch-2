package jan31;

import java.util.TreeSet;

public class Question50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("red");
		myset.add("green");
		myset.add("blue");
		myset.add("pink");
		myset.add("black");
		System.out.println(myset);
		System.out.println("first element is:" +myset.pollFirst());
		System.out.println("after removing first element: " +myset);
	}

}
