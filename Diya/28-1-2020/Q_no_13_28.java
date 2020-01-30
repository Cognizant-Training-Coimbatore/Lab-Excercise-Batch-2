package Project1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q_no_13_28 {

	public static void main(String[] args) {
		TreeSet<String>a1 = new TreeSet<String>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		TreeSet<String>a2 = new TreeSet<String>();
		a2.add("four");
		a2.add("Five");
		a2.add("Six");
		a1.addAll(a2);
		System.out.println(a1);
}
}
