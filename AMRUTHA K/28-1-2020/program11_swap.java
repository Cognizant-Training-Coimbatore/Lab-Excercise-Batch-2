package packagee;

import java.util.Collections;
import java.util.LinkedList;

public class program11_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>abc=new LinkedList<String>();
		abc.add("man");
		abc.add("moon");
		abc.add("abhh");
		abc.add("red");
		abc.add("black");
		abc.add("white");
		Collections.swap(abc, 0, 5);
		System.out.println(abc);

	}

}
