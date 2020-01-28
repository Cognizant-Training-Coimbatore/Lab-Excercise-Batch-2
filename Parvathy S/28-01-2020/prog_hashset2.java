import java.util.HashSet;
import java.util.Set;

public class prog_hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset =  new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("one");
		myset.add("three");
		myset.add("four");
		System.out.println(myset);
		for(String x:myset)
		{
			System.out.println(x);
		}
		

	}

}
