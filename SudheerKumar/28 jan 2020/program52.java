import java.util.HashSet;
import java.util.Set;
public class program52 {

	public static void main(String[] args) {
		Set<String> list1=new HashSet<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("one");
		System.out.println(list1);
		for(String x:list1)
		{
			System.out.println(x);
		}
		// TODO Auto-generated method stub

	}

}
