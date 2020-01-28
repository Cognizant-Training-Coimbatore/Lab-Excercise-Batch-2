import java.util.HashSet;
import java.util.Set;

public class program46_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(1);//hashset will not allow duplicate values
		myset.add(2);
		myset.add(3);
		System.out.println(myset);

	}

}
