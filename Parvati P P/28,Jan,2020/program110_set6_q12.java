package Package3;


import java.util.HashSet;

public class program110_set6_q12 {

	public static void main(String[] args) {
		HashSet <String> c1 = new HashSet <String> (5);
		HashSet <String> c2 = new HashSet <String> (5);
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("\nFirst HashSet: " + c1);
		c2.add("Maroon");
		c2.add("Green");
		c2.add("Black");
		c2.add("Gold");
		c2.add("Turquoise");
		System.out.println("\nFirst HashSet: " + c2);
		c1.retainAll(c2);
		System.out.println("\nRetained set: " + c1);
	}

}
