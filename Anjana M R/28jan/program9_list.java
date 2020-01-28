import java.util.ArrayList;
import java.util.List;

public class program9_list {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("item 1");
		mylist.add("item 2");
		mylist.add("item 3");
		mylist.add("item 4");
		mylist.add("item 5");
		System.out.println("Total items"+mylist.size());
		System.out.println("Testing item4 exists"+mylist.contains("item 4"));
		System.out.println("Printing all items"+mylist);
		System.out.println("Removing item3"+mylist.remove("item 3"));
		System.out.println("All items"+mylist);
		System.out.println("total after removing"+mylist.size());
		
	}

}
