import java.util.HashSet;
import java.util.Set;

public class program42_hashset 
{

	public static void main(String[] args) 
	{
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(2);
		myset.add(4);
		myset.add(2);
		myset.add(3);
		System.out.println(myset);

	}

}
