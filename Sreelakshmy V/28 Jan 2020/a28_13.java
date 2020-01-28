

import java.util.Set;
import java.util.TreeSet;

public class a28_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> mylist = new TreeSet<String>();
		Set<String> mylist1 = new TreeSet<String>();
		mylist.add("red");
		mylist.add("orange");
		mylist.add("blue");
		mylist1.add("green ");
		mylist1.add("blue");
		mylist1.add( "black");
		mylist.addAll(mylist1);
		System.out.println(mylist);


	}

}
