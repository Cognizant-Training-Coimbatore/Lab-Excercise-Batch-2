import java.util.HashSet;
import java.util.Set;

public class lab12 {

	public static void main(String[] args) {
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(4);
		myset.add(2);
		myset.add(3);
		System.out.println(myset);
		Set<Integer> myset1 = new HashSet<Integer>();
		myset1.add(1);
		myset1.add(5);
		myset1.add(6);
		myset1.add(3);
		System.out.println(myset1);
		myset.retainAll(myset1);
		System.out.println(myset);
	}

}
