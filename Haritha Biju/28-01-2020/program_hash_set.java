import java.util.HashSet;
import java.util.Set;

public class program_hash_set {

	public static void main(String[] args) {

		//Hashset
		System.out.println("\n\n HashSet");
		Set<String> myset=new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("one");
		myset.add("four");
		System.out.println(myset);
		for(String z:myset)
		{
			System.out.println(z);
		}
	}

}
