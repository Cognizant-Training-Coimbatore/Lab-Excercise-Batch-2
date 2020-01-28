import java.util.ArrayList;
import java.util.List;

public class program96_mylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		System.out.println("Total items are:" +mylist.size());
		System.out.println("Testing item3 exists" + mylist.contains("Item4"));
		System.out.println("Printing all items" +mylist);
		System.out.println("Removing item 3...");
		mylist.remove("item3");
		System.out.println("Printing all items after removing" + mylist);
		System.out.println("Total items after removing" +mylist.size());
	}

}
