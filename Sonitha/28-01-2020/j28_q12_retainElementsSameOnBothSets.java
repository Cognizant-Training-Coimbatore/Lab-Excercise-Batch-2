import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class j28_q12_retainElementsSameOnBothSets {

	public static void main(String[] args) {
		HashSet myhash = new HashSet();
		myhash.add( "Item1");
		myhash.add( "Item2");
		myhash.add( "Item3");
		myhash.add( "Item4");
		myhash.add( "Item5");
		myhash.add( "Item6");
		System.out.println("Items in the myhash :"+ myhash);
		HashSet h2 = new HashSet();
		h2.add("Item2");
		h2.add("Item4");
		h2.add("Item5");
		h2.add("Item7");
		h2.add("Item8");
		h2.add("Item9");
		System.out.println("Items in the h2 : "+ h2);
		myhash.retainAll(h2);
		System.out.println(myhash);
	}

}
