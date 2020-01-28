import java.util.HashSet;
import java.util.Set;

public class program88hashset {

	public static void main(String[] args) {
		// hashset does not allow duplicates
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(1);
		myset.add(2);
		myset.add(3);
		System.out.println(myset);
		
	}

}
