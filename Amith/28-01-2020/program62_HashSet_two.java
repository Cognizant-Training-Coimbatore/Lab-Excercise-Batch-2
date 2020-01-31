import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program62_HashSet_two {

	public static void main(String[] args) 
	{
		Set<String>list=new HashSet<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		list.add("two");
		list.add("four");
		System.out.println(list);
		for(String x:list)
		{
			System.out.println(x);
		}

	}

}
