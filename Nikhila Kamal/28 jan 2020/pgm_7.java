package pgm_excercises_28_jan;

import java.util.ArrayList;
import java.util.List;

public class pgm_7 {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("nikhila");
		mylist.add("kamal");
		mylist.add("java");
		System.out.println("list: " + mylist);
		mylist.set(1,"c++");
		System.out.println("after replacement:" + mylist);

	}

}
