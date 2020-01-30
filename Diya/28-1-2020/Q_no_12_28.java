package Project1;

import java.util.HashSet;
import java.util.Set;

public class Q_no_12_28 {

	public static void main(String[] args) {
		Set<String>a1 = new HashSet<String>();
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");
		a1.add("five");
		System.out.println(a1);
		Set<String>a2 = new HashSet<String>();
		a2.add("one");
		a2.add("three");
		a2.add("four");
		a1.retainAll(a2);
		System.out.println("The common elements: "+a1);
	}

}
