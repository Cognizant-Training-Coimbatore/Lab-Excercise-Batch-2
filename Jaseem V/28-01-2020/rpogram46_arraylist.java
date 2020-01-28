import java.util.ArrayList;
import java.util.List;

public class rpogram46_arraylist {

	public static void main(String[] args) 
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		mylist.add("item5");
		System.out.println("Totel items"+ mylist.size());
		System.out.println("Testing item4 exists :"+ mylist.contains("item4"));
		System.out.println("Printing all items"+mylist);
		System.out.println("Removing item3.....");
		mylist.remove("item3");
		System.out.println("Printing all items after removing"+mylist);
		System.out.println("Total items after removing"+mylist.size());

	}

}
