import java.util.Iterator;
import java.util.TreeSet;



public class j28_q14_NumbersLessThanSeven {

	public static void main(String[] args) {
		TreeSet<Integer> s1 = new TreeSet<Integer>();
		TreeSet<Integer> s2 = new TreeSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		s1.add(10);
		System.out.println(s1);
		s2 = (TreeSet)s1.headSet(7);
		System.out.println("After using headset to find numbers less than 7 in the treeset");
		Iterator  i1 = s2.iterator();
		System.out.println("Treeset data :");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
