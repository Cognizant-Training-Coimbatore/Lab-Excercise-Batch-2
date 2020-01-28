import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class corejava_q9_iterate_from_givenpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_Strings=new ArrayList<String>();
		list_Strings.add("apple");
		list_Strings.add("orange");
		list_Strings.add("banana");
		list_Strings.add("lemon");
		System.out.println(list_Strings);
		System.out.println("iterate");
		Iterator itr=list_Strings.listIterator(1);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

	}

}
