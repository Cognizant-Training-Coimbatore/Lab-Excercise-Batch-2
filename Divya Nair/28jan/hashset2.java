import java.util.HashSet;
import java.util.Set;

public class hashset2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set<Integer> myset=new HashSet<Integer>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2);
		System.out.println(myset);
		for(Integer x:myset)
		{
			System.out.println(x);
		}

	}

}
