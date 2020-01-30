import java.util.ArrayList;
import java.util.List;

public class program48_arraylist_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> mylist=new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		System.out.println("total items " +mylist.size());
		System.out.println("testing item4 exists " +mylist.contains("item4"));
			System.out.println("printing all items " +mylist);
			System.out.println("removing item 3..");
			mylist.remove("item3");
			System.out.println("printing all items after removing " +mylist);
			System.out.println("total items after removing " +mylist.size());
		
	}

}
