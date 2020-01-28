import java.util.HashSet;
import java.util.Set;

public class program52_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String > myset = new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("one");
		myset.add("four");
		for(String s : myset) {
			System.out.println(s);//unordered and no duplicates are allowed
		}

	}

}
