import java.util.Set;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args)
	{
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(98);
		myset.add(1);
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(7);
		myset.add(5);
		System.out.println(myset);
		for(Integer x:myset)
		{
			System.out.println(x);
		}

	}

}
