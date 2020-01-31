import java.util.HashSet;
import java.util.Set;

public class program86_hashset {

	public static void main(String[] args) {
		Set<Integer> myset=new HashSet<Integer>();
		myset.add(1);
		myset.add(3);
		myset.add(5);
		myset.add(3);
		System.out.println(myset);
	}

}
