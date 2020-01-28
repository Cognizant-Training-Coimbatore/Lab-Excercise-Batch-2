import java.util.Iterator;
import java.util.TreeSet;

public class j28_q15_GetElementGreaterThanOrEqualTo {

	public static void main(String[] args) {
		TreeSet<Integer> s1 = new TreeSet<Integer>();

		s1.add(13);
		s1.add(2);
		s1.add(32);
		s1.add(4);
		s1.add(55);
		s1.add(6);
		s1.add(7);
		s1.add(83);
		s1.add(95);
		s1.add(10);
		System.out.println(s1);
		System.out.println("Element greater than or equal to 50 in the treeset is :"+s1.ceiling(50));


	}

}
