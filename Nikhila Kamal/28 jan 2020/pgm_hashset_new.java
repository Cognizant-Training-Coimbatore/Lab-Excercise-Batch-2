import java.util.HashSet;
import java.util.Set;

public class pgm_hashset_new {

	public static void main(String[] args) {
		Set<String> myset=new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("one");
		myset.add("four");
		System.out.println(myset);
		for(String s:myset)
		{
			System.out.println(s);
		}
	}

}
