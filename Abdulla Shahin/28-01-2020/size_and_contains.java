import java.util.ArrayList;
import java.util.List;

public class size_and_contains {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		mylist.add("item5");
		System.out.println("total items " + mylist.size());
		System.out.println("testing item4 exists "+ mylist.contains("item4"));
		System.out.println("printing all items "+ mylist);
		System.out.println("remove item 3");
		mylist.remove("item3");
		System.out.println("printing all items after removing"+ mylist);
		System.out.println("total items after removing" + mylist.size());

	}

}
