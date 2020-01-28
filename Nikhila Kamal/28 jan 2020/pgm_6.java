package pgm_excercises_28_jan;

import java.util.ArrayList;
import java.util.List;

public class pgm_6 {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("nikhila");
		mylist.add("kamal");
		mylist.add("java");
		System.out.println(mylist);
		System.out.println("number of items in list: " + mylist.size());
		mylist.add("c++");
		System.out.println("number of items in list after adding: " + mylist.size());

	}

}
